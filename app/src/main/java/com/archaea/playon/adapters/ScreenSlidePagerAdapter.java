package com.archaea.playon.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.archaea.serviceplans.ServicePlanFragment;

/**
 * Created by vizsatiz on 27-11-2016.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new ServicePlanFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }

}