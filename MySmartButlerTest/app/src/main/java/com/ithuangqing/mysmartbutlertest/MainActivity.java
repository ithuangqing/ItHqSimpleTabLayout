package com.ithuangqing.mysmartbutlertest;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ithuangqing.mysmartbutlertest.fragment.Fragment1;
import com.ithuangqing.mysmartbutlertest.fragment.Fragment2;
import com.ithuangqing.mysmartbutlertest.utils.ItHqAddTab;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ithuangqing
 */
public class MainActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private List<String> mTitle;
    private List<Fragment> mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mTabLayout = (TabLayout)findViewById(R.id.mTabLayout);
        mViewPager = (ViewPager)findViewById(R.id.mViewPager);

        mTitle = new ArrayList<>();
        mTitle.add("首页");
        mTitle.add("中心");

        mFragment = new ArrayList<>();
        mFragment.add(new Fragment1());
        mFragment.add(new Fragment2());

       ItHqAddTab.addTab(mTabLayout,mViewPager,mFragment,mTitle,getSupportFragmentManager());
    }
}
