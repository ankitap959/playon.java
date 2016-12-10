package com.archaea.playon.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.archaea.common.CircularNetworkImageView;
import com.archaea.common.ImageFeedController;
import com.archaea.models.LruBitmapCache;
import com.archaea.models.Reviews;
import com.archaea.playon.R;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 09-12-2016.
 */
public class ReviewListAdapter extends RecyclerView.Adapter<ReviewListViewHolder>{

    private ArrayList<Reviews> reviewList;
    private ImageLoader imageLoader;

    public ReviewListAdapter(ArrayList<Reviews> reviewList, Activity currentActivity) {
        this.reviewList = reviewList;
        imageLoader = new ImageLoader(Volley.newRequestQueue(currentActivity), new LruBitmapCache());
    }

    @Override
    public ReviewListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_feed_item, parent, false);
        return  new ReviewListViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ReviewListViewHolder holder, int position) {
        final Reviews review = reviewList.get(position);
        holder.userName.setText(review.getUserName());
        holder.timeStamp.setText("vishnu");
        holder.reviewComment.setText("rnjodrfnvreiofn oefnhweriojfweio wfonhwejiofrjewiofj oeifnweiofjo eiofnweiojfo fweofnowejfo weonho");
        if (imageLoader == null)
            imageLoader = ImageFeedController.getInstance().getImageLoader();
        holder.userProfilePic.setImageUrl("http://192.168.174.1:9080/assets/img/app/feed/test-image.png", imageLoader);
    }

    @Override
    public int getItemCount() {
        return reviewList.size();
    }
}

// Provide a reference to the views for each data item
// Complex data items may need more than one view per item, and
// you provide access to all the views for a data item in a view holder
class ReviewListViewHolder extends RecyclerView.ViewHolder {
    // each data item is just a string in this case
    public TextView userName;
    public TextView timeStamp;
    public TextView reviewComment;
    public CircularNetworkImageView userProfilePic;

    public ReviewListViewHolder(View v) {
        super(v);
        userName = (TextView) v.findViewById(R.id.user_name);
        timeStamp = (TextView) v.findViewById(R.id.timestamp);
        userProfilePic = (CircularNetworkImageView) v.findViewById(R.id.user_profile_pic);
        reviewComment = (TextView) v.findViewById(R.id.review_comment);
    }
}
