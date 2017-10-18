package com.ithuangqing.mylibrary.utils;

import android.support.v4.app.Fragment;

import java.util.Arrays;
import java.util.List;

/**
 * @author ithuangqing
 * @data 2017/10/18.
 */

public class ItHqAddFragment {
    public static List<Fragment> addFragment(Fragment ... fragments){

       Fragment[] m = fragments;

        List<Fragment> fragmentList = Arrays.asList(m);

        return fragmentList;
    }
}
