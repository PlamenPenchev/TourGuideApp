package com.example.punked.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Punked on 4/21/2018.
 */

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public TourFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
     }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new VarnaInfoFragment();
        } else if (position == 1){
            return new HotelsFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new GardenAndParksFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position){
            case 0:
                return context.getString(R.string.varna_tab);
            case 1:
                return context.getString(R.string.hotels_tab);
            case 2:
                return context.getString(R.string.attractions_tab);
            default:
                return context.getString(R.string.garden_tab);
        }
    }
}
