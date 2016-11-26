package com.archaea.playon;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;

import com.archaea.models.BookingCalender;
import com.archaea.playon.adapters.BookingCalenderAdapter;

import java.util.ArrayList;

public class BookingActivity extends Activity {

    private static final String TAG = BookingActivity.class.getSimpleName();

    public float firstItemWidthDate;
    public float paddingDate;
    public float itemWidthDate;
    public int allPixelsDate;
    public int finalWidthDate;
    private BookingCalenderAdapter dateAdapter;
    private ArrayList<BookingCalender> labelerDates = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        getRecyclerViewDate();
    }


    public void getRecyclerViewDate() {
        final RecyclerView recyclerViewDate = (RecyclerView) findViewById(R.id.rv_tasks_date);
        if (recyclerViewDate != null) {
            recyclerViewDate.postDelayed(new Runnable() {
                @Override
                public void run() {
                    setDateValue();
                }
            }, 300);
            recyclerViewDate.postDelayed(new Runnable() {
                @Override
                public void run() {
                    recyclerViewDate.smoothScrollToPosition(dateAdapter.getItemCount()-1);
                    setDateValue();
                }
            }, 5000);
        }

        ViewTreeObserver vtoDate = recyclerViewDate != null ? recyclerViewDate.getViewTreeObserver() : null;
        if (vtoDate != null) {
            vtoDate.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {


                @Override
                public boolean onPreDraw() {
                    recyclerViewDate.getViewTreeObserver().removeOnPreDrawListener(this);
                    finalWidthDate = recyclerViewDate.getMeasuredWidth();
                    itemWidthDate = getResources().getDimension(R.dimen.item_dob_width);
                    paddingDate = (finalWidthDate - itemWidthDate) / 2;
                    firstItemWidthDate = paddingDate;
                    allPixelsDate = 0;

                    final LinearLayoutManager dateLayoutManager = new LinearLayoutManager(getApplicationContext());
                    dateLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                    recyclerViewDate.setLayoutManager(dateLayoutManager);
                    recyclerViewDate.addOnScrollListener(new RecyclerView.OnScrollListener() {
                        @Override
                        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                            super.onScrollStateChanged(recyclerView, newState);
                            synchronized (this) {
                                if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                                    calculatePositionAndScrollDate(recyclerView);
                                }
                            }
                        }

                        @Override
                        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                            super.onScrolled(recyclerView, dx, dy);
                            allPixelsDate += dx;
                        }
                    });
                    if (labelerDates == null) {
                        labelerDates = new ArrayList<>();
                    }
                    genLabelerDate();
                    dateAdapter = new BookingCalenderAdapter(labelerDates, (int) firstItemWidthDate);
                    recyclerViewDate.setAdapter(dateAdapter);
                    dateAdapter.setSelectedItem(dateAdapter.getItemCount() - 1);
                    return true;
                }
            });
        }
    }

    private void genLabelerDate() {
        for (int i = 0; i < 11; i++) {
            BookingCalender labelerDate = new BookingCalender();
            labelerDate.setNumber(Integer.toString(i));
            if (i > 0 && i < 10) {
                labelerDate.setNumber("0" + Integer.toString(i));
            }
            labelerDate.setDay("Mon");
            labelerDate.setMonth("Nov");
            labelerDates.add(labelerDate);
            if (i == 0 || i == 10) {
                labelerDate.setType(BookingCalenderAdapter.VIEW_TYPE_PADDING);
            } else {
                labelerDate.setType(BookingCalenderAdapter.VIEW_TYPE_ITEM);
            }
        }
    }

    private void calculatePositionAndScrollDate(RecyclerView recyclerView) {
        int expectedPositionDate = Math.round((allPixelsDate + paddingDate - firstItemWidthDate) / itemWidthDate);

        if (expectedPositionDate == -1) {
            expectedPositionDate = 0;
        } else if (expectedPositionDate >= recyclerView.getAdapter().getItemCount() - 2) {
            expectedPositionDate--;
        }
        scrollListToPositionDate(recyclerView, expectedPositionDate);
    }

    /* this if most important, if expectedPositionDate < 0 recyclerView will return to nearest item*/
    private void scrollListToPositionDate(RecyclerView recyclerView, int expectedPositionDate) {
        float targetScrollPosDate = expectedPositionDate * itemWidthDate + firstItemWidthDate - paddingDate;
        float missingPxDate = targetScrollPosDate - allPixelsDate;
        if (missingPxDate != 0) {
            recyclerView.smoothScrollBy((int) missingPxDate, 0);
        }
        setDateValue();
    }


    private void setDateValue() {
        int expectedPositionDateColor = Math.round((allPixelsDate + paddingDate - firstItemWidthDate) / itemWidthDate);
        int setColorDate = expectedPositionDateColor + 1;
        dateAdapter.setSelectedItem(setColorDate);
    }
}