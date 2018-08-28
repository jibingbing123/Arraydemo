package com.array.methodOfArray;

import java.util.Arrays;

/**
 * Created by jibingbing on 2017/12/3.
 */
public class SortingArrays {
    public static void main(String[] args) {
        int[] a = {2,6,3,9,1};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        int location = Arrays.binarySearch(a,3);
        System.out.println("3 在排序后数组的位置为:" + location);
    }
}
