package com.jorgedirkx;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {

        int[]iArray = new int[]{1,2,3};
        String[]sArray = new String[]{"one","two","three"};

        //method 1

        System.out.println("original int array:"+ Arrays.toString(iArray));
        ArrayUtils.reverse(iArray);
        System.out.println("reverse int array:" + Arrays.toString(iArray));

        //method 2

        for(int i= 0; i<iArray.length;i++){
            int j = iArray[i];
            iArray[i]= iArray[iArray.length-i-1];
            iArray[iArray.length-i-1]=j;

        }
        System.out.println("reverse int array method nr2:"+ Arrays.toString(iArray));

        //or
        int[]nrs = {1,2,3};

        for(int i = nrs.length-1;i>=0;--i){
            System.out.println(nrs[i]);
        }

        //method 3: using List from the Collections framework

        List<String>list = Arrays.asList(sArray);

        Collections.reverse(list);

        String[]reversed = list.toArray(sArray);

        System.out.println("reverse String array"+ Arrays.toString(reversed));


    }
}
