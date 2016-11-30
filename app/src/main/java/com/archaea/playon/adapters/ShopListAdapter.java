package com.archaea.playon.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.archaea.common.CircularNetworkImageView;
import com.archaea.common.ImageFeedController;
import com.archaea.models.LruBitmapCache;
import com.archaea.models.Shop;
import com.archaea.playon.R;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 25-10-2016.
 */
public class ShopListAdapter extends RecyclerView.Adapter<ShopListViewHolder>{

    private ArrayList<Shop> shopFeedItems;
    private Activity currentActivity;
    LruBitmapCache mLruBitmapCache;
    private ImageLoader imageLoader;

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
        imageLoader = new ImageLoader(Volley.newRequestQueue(currentActivity), new LruBitmapCache());
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
        holder.shopDescription.setText(shop.getShopDescription());
        if (imageLoader == null)
            imageLoader = ImageFeedController.getInstance().getImageLoader();
        holder.shopProfilePic.setImageUrl("http://192.168.174.1:9080/assets/img/blue-bg.jpg", imageLoader);
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
    public CircularNetworkImageView shopProfilePic;

    public ShopListViewHolder(View v) {
        super(v);
        shopName = (TextView) v.findViewById(R.id.shop_name);
        shopDescription = (TextView) v.findViewById(R.id.shop_description);
        shopProfilePic = (CircularNetworkImageView) v.findViewById(R.id.profile_picture);
    }
}
