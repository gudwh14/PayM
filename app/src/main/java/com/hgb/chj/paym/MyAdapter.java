package com.hgb.chj.paym;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mData = new ArrayList<Fragment>();
    public MyAdapter(FragmentManager fm) {
        super(fm);

        /*mData = new ArrayList<>();
        mData.add(new OptionFragment());
        mData.add(new PayFragment());
        mData.add(new InputFragment()); */
    }

    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }
    public void addItem(Fragment fragment) {
        mData.add(fragment);
    }

}
