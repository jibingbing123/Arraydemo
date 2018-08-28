package com.array.createTestData;

import java.util.Arrays;

/**
 * Arrays.fill()方法只能用同一个值填充数组
 * fill()方法可以填充整个数组,也可以只填充某块区域
 * Created by jibingbing on 2017/12/3.
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
        int[] a2 = new int[size];
        String[] a3 = new String[size];

        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        System.out.println("a2 = " + Arrays.toString(a3));

        Arrays.fill(a1,true);
        Arrays.fill(a2,5);
//        注意填充起始索引,但不填充结束索引,下标为5的位置不填充
        Arrays.fill(a3,3,5,"ji");

        System.out.println("After fill array...");
        System.out.println("a1 = " + Arrays.toString(a1));
        System.out.println("a2 = " + Arrays.toString(a2));
        System.out.println("a2 = " + Arrays.toString(a3));
    }
}
