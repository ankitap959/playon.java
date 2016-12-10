package com.archaea.playon.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.archaea.models.BookingCalender;
import com.archaea.playon.R;

import java.util.ArrayList;

public class BookingCalenderAdapter extends RecyclerView.Adapter<BookingCalenderAdapter.DateViewHolder> {

    private static final String TAG = BookingCalenderAdapter.class.getSimpleName();
    private ArrayList<BookingCalender> dateDataList;


    public static final int VIEW_TYPE_PADDING = 1;
    public static final int VIEW_TYPE_ITEM = 2;
    private int paddingWidthDate = 0;

    private int selectedItem = 1;

    public BookingCalenderAdapter(ArrayList<BookingCalender> dateData, int paddingWidthDate) {
        this.dateDataList = dateData;
        this.paddingWidthDate = paddingWidthDate;
    }


    @Override
    public DateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_ITEM) {
            final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calender_feed,
                    parent, false);
            return new DateViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.calender_feed,
                    parent, false);

            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            layoutParams.width = paddingWidthDate;
            view.setLayoutParams(layoutParams);
            return new DateViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(DateViewHolder holder, int position) {
        BookingCalender labelerDate = dateDataList.get(position);
        if (getItemViewType(position) == VIEW_TYPE_ITEM) {
            holder.tvDate.setText(labelerDate.getNumber());
            holder.day.setText(labelerDate.getDay());
            holder.month.setText(labelerDate.getMonth());
            holder.tvDate.setVisibility(View.VISIBLE);
            if (position == selectedItem) {
                holder.tvDate.setTextColor(holder.tvDate.getResources().getColor(R.color.colorPrimary));
                holder.day.setTextColor(holder.day.getResources().getColor(R.color.colorPrimary));
                holder.month.setTextColor(holder.month.getResources().getColor(R.color.colorPrimary));
                holder.calenderFeedItem.setBackgroundColor(Color.WHITE);
                holder.tvDate.setBackgroundColor(Color.WHITE);
                holder.day.setBackgroundColor(Color.WHITE);
                holder.month.setBackgroundColor(Color.WHITE);
            } else {
                holder.tvDate.setTextColor(Color.WHITE);
                holder.day.setTextColor(Color.WHITE);
                holder.month.setTextColor(Color.WHITE);
                holder.calenderFeedItem.setBackgroundColor(holder.calenderFeedItem.getResources().getColor(R.color.colorPrimary));
                holder.tvDate.setBackgroundColor(holder.tvDate.getResources().getColor(R.color.colorPrimary));
                holder.day.setBackgroundColor(holder.day.getResources().getColor(R.color.colorPrimary));
                holder.month.setBackgroundColor(holder.month.getResources().getColor(R.color.colorPrimary));
            }
        } else {
            holder.tvDate.setVisibility(View.INVISIBLE);
        }
    }

    public void setSelectedItem(int selectedItem) {
        this.selectedItem = selectedItem;
        notifyDataSetChanged();
    }

    public int getSelectedItem() {
        return this.selectedItem;
    }

    @Override
    public int getItemCount() {
        return dateDataList.size();
    }

    @Override
    public int getItemViewType(int position) {
        BookingCalender labelerDate = dateDataList.get(position);
        if (labelerDate.getType() == VIEW_TYPE_PADDING) {
            return VIEW_TYPE_PADDING;
        } else {
            return VIEW_TYPE_ITEM;
        }

    }

    public class DateViewHolder extends RecyclerView.ViewHolder {
        public TextView tvDate;
        public TextView day;
        public TextView month;
        public LinearLayout calenderFeedItem;

        public DateViewHolder(View itemView) {
            super(itemView);
            tvDate = (TextView) itemView.findViewById(R.id.date);
            day = (TextView) itemView.findViewById(R.id.day);
            month = (TextView) itemView.findViewById(R.id.month);
            calenderFeedItem = (LinearLayout) itemView.findViewById(R.id.calender_feed_item);
        }
    }
}