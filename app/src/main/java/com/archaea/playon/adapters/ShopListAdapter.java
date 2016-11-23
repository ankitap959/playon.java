package com.archaea.playon.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.archaea.models.Shop;
import com.archaea.playon.R;
import com.archaea.playon.ShopDetailsActivity;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 25-10-2016.
 */
public class ShopListAdapter extends RecyclerView.Adapter<ShopListViewHolder>{

    private ArrayList<Shop> shopFeedItems;
    private Activity currentActivity;

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public void setShopFeedItems(ArrayList<Shop> shopFeedItems) {
        this.shopFeedItems = shopFeedItems;
    }

    public ShopListAdapter(ArrayList<Shop> shopFeedItems, Activity currentActivity) {
        this.shopFeedItems = shopFeedItems;
        this.currentActivity = currentActivity;
    }


    @Override
    public ShopListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_feed_layout, parent, false);
        return  new ShopListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ShopListViewHolder holder, int position) {
        final Shop shop = shopFeedItems.get(position);
        holder.shopName.setText(shop.getShopName());
        // TODO change the shop title to whatever appropriate (probably an image)
        holder.shopTitle.setText(shop.getShopName());
        holder.shopDescription.setText(shop.getShopDescription());
        holder.shopTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(currentActivity, ShopDetailsActivity.class);
                intent.putExtra("shopGuid", "Vishnu");
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                currentActivity.getApplicationContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return shopFeedItems.size();
    }

    public void add(int position,Shop shop){
        shopFeedItems.add(position, shop);
        notifyItemInserted(position);
    }

    public void add(Shop shop) {
        shopFeedItems.add(shop);
        notifyItemInserted(shopFeedItems.size() - 1);
    }

    public void remove(int position){
        shopFeedItems.remove(position);
        notifyItemRemoved(position);
    }
}

// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
class ShopListViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView shopName;
    public TextView shopTitle;
    public TextView shopDescription;
    public LinearLayout shopTab;

    public ShopListViewHolder(View v) {
        super(v);
        shopName = (TextView) v.findViewById(R.id.shopName);
        shopTitle = (TextView) v.findViewById(R.id.shopTitle);
        shopDescription = (TextView) v.findViewById(R.id.shopDescription);
        shopTab = (LinearLayout) v.findViewById(R.id.shop_feed_item_layout);
    }
}
