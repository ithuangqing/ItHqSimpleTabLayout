package com.ithuangqing.mylibrary.utils;

import java.util.Arrays;
import java.util.List;

/**
 * @author ithuangqing
 * @data 2017/10/18.
 */

public class ItHqAddTitle {

    public static List<String> addTitle(String ... a){

        String[] title = a;

        List<String> list = Arrays.asList(title);

        return list;

    }
}
