package com.example.rojo.treasurecoasttour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EatFragment();
        } else if (position == 1) {
            return new ExploreFragment();
        } else if (position == 2) {
            return new PlayFragment();
        } else {
            return new ShopFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.Eat);
        } else if (position == 1) {
            return mContext.getString(R.string.Explore);
        } else if (position == 2) {
            return mContext.getString(R.string.Play);
        } else {
            return mContext.getString(R.string.Shop);
        }
    }
}