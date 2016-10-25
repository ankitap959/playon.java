package com.archaea.playon.adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.archaea.models.Shop;

import java.util.List;

/**
 * Created by vizsatiz on 25-10-2016.
 */
public class BookingListAdapter extends BaseAdapter{

    private Activity currentActivity;
    private List<Shop> shopFeedItems;

    public BookingListAdapter(Activity currentActivity, List<Shop> shopFeedItems) {
        this.currentActivity = currentActivity;
        this.shopFeedItems = shopFeedItems;
    }

    @Override
    public int getCount() {
        return shopFeedItems.size();
    }

    @Override
    public Object getItem(int i) {
        return shopFeedItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return shopFeedItems.get(i).getShopId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
