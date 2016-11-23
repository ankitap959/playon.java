package com.archaea.playon;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.archaea.models.BookingCalender;
import com.archaea.playon.adapters.BookingCalenderAdapter;

import java.util.ArrayList;

public class BookingActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.booking_calender);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);

        ArrayList<BookingCalender> bookingDates = new ArrayList<>();
        bookingDates.add(new BookingCalender(12, "Monday"));
        bookingDates.add(new BookingCalender(12, "Monday"));
        bookingDates.add(new BookingCalender(12, "Monday"));
        bookingDates.add(new BookingCalender(12, "Monday"));
        final BookingCalenderAdapter bookingCalenderAdapter = new BookingCalenderAdapter(bookingDates, this);
        recyclerView.setAdapter(bookingCalenderAdapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
