package com.archaea.playon.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.archaea.models.BookingCalender;
import com.archaea.playon.R;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 24-11-2016.
 */
public class BookingCalenderAdapter extends RecyclerView.Adapter<BookingCalenderListViewHolder>{


    private ArrayList<BookingCalender> bookingCalenderItems;
    private Activity currentActivity;

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public void setShopFeedItems(ArrayList<BookingCalender> bookingCalenderItems) {
        this.bookingCalenderItems = bookingCalenderItems;
    }

    public BookingCalenderAdapter(ArrayList<BookingCalender> bookingCalenderItems, Activity currentActivity) {
        this.bookingCalenderItems = bookingCalenderItems;
        this.currentActivity = currentActivity;
    }

    @Override
    public BookingCalenderListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.calender_feed, parent, false);
        return  new BookingCalenderListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(BookingCalenderListViewHolder holder, int position) {
        final BookingCalender bookingCalender = bookingCalenderItems.get(position);
        // TODO change the shop title to whatever appropriate (probably an image)
        holder.shopName.setText(bookingCalender.getDay());
    }

    @Override
    public int getItemCount() {
        return bookingCalenderItems.size();
    }
}

// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
class BookingCalenderListViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView shopName;

    public BookingCalenderListViewHolder(View v) {
        super(v);
        this.shopName = (TextView) v.findViewById(R.id.shopName);
    }
}
