package com.archaea.playon;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.archaea.models.LruBitmapCache;

public class ShopDetailsActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        ImageLoader imageLoader = new ImageLoader(Volley.newRequestQueue(this), new LruBitmapCache());
        NetworkImageView coverPhoto = (NetworkImageView) findViewById(R.id.shop_cover_photo);
        coverPhoto.setImageUrl("http://192.168.174.1:9080/assets/img/app/typography/typo03.png", imageLoader);
        coverPhoto.setScaleType(ImageView.ScaleType.FIT_XY);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
