package com.ithuangqing.mysmartbutlertest.utils;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentManager;
import java.util.List;

/**
 * @author ithuangqing
 * @data 2017/10/17.
 */

public class ItHqAddTab {
    public  static   void addTab(TabLayout tabLayout, ViewPager viewPager, final List<Fragment> fragment, final List<String> title, FragmentManager fragmentManager){
        /**
         * 预加载
         */
        viewPager.setOffscreenPageLimit(fragment.size());

        viewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                return fragment.get(position);
            }
            @Override
            public int getCount() {
                return fragment.size();
            }
            @Override
            public CharSequence getPageTitle(int position) {
                return title.get(position);
            }
        });
       // TabLayout关联ViewPager
        tabLayout.setupWithViewPager(viewPager);

    }

}
