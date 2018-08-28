package com.array.methodOfArray;

import java.util.Arrays;

/**
 * Arrays类重载了equals()方法,用于比较整个数组
 * 数组相等的条件是:1.数组长度相等;2.对应位置的元素相同
 * Created by jibingbing on 2017/12/3.
 */
public class ComparingArrays {
    public static void main(String[] args) {
        int[] a1 = new int[10];
        int[] a2 = new int[10];

        Arrays.fill(a1,12);
        Arrays.fill(a2,12);

        boolean b = Arrays.equals(a1,a2);
        if(b){
            System.out.println("a1 = a2");
        } else {
            System.out.println("a1 != a2");
        }

        a2[3] = 13;
        System.out.println(Arrays.equals(a1,a2));
    }
}
