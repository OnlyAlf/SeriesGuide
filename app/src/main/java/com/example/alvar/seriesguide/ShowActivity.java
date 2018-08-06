package com.example.alvar.seriesguide;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class ShowActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        tabLayout = (TabLayout) findViewById(R.id.tl_show_activity);
        viewPager = (ViewPager) findViewById(R.id.vp_show_activity);
        ShowViewPageAdapter adapter = new ShowViewPageAdapter(getSupportFragmentManager());

        adapter.addFragment(ShowFragment.getInstance(), "Show");
        adapter.addFragment(SeasonFragment.getInstance(), "Season");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);




    }

}
