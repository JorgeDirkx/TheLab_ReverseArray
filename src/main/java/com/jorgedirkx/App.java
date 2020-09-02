package com.jorgedirkx;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        int[]iArray = new int[]{1,2,3};
        String[]sArray = new String[]{"one","two","three"};

        System.out.println("original int array:"+ Arrays.toString(iArray));
        ArrayUtils.reverse(iArray);
        System.out.println("reverse int array:" + Arrays.toString(iArray));
    }
}
