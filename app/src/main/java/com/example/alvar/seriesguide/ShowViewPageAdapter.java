package com.example.alvar.seriesguide;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ShowViewPageAdapter extends FragmentPagerAdapter{

    private final List<Fragment> fragmentsList = new ArrayList<>();
    private final List<String> fragmentListTitles = new ArrayList<>();

    public ShowViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentsList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitles.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        fragmentsList.add(fragment);
        fragmentListTitles.add(title);
    }

}
