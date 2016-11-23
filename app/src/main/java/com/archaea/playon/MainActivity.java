package com.archaea.playon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.archaea.playon.adapters.MainActivityViewPagerAdapter;
import com.archaea.playon.tabs.shops.ShopFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ViewPager mainActivityViewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(mainActivityViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mainActivityViewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void setupViewPager(ViewPager viewPager) {
        MainActivityViewPagerAdapter adapter = new MainActivityViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(ShopFragment.newInstance("Dummyp1", "DummyP2"), "Shops");
        adapter.addFragment(ShopFragment.newInstance("Dummyp1", "DummyP2"), "test2");
        adapter.addFragment(ShopFragment.newInstance("Dummyp1", "DummyP2"), "Test3");
        adapter.addFragment(ShopFragment.newInstance("Dummyp1", "DummyP2"), "test4");
        viewPager.setAdapter(adapter);
    }



}
