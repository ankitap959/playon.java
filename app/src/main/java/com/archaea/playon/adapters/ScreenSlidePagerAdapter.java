package com.archaea.playon.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by vizsatiz on 27-11-2016.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> servicePlanFragments;

    public ScreenSlidePagerAdapter(FragmentManager fm, ArrayList<Fragment> servicePlans) {
        super(fm);
        this.servicePlanFragments = servicePlans;
    }

    @Override
    public Fragment getItem(int position) {
        return servicePlanFragments.get(position);
    }

    @Override
    public int getCount() {
        return servicePlanFragments.size();
    }

}