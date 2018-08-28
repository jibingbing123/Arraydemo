package com.array.methodOfArray;

import java.util.Arrays;

/**
 * Java标准库中arraycopy()方法的使用,用它复制数组比for()循环复制要快得多
 * arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 * src:源数组,srcPos:源数组从什么位置开始复制的下标,dest:目标数组,destPos:从目标数组的什么位置开始复制的下标,length:复制元素的个数
 * Created by jibingbing on 2017/12/3.
 */
public class CopingArrays {
    public static void main(String[] args) {
        int[] i = new int[6];
        int[] j = new int[9];
        Arrays.fill(i,66);
        Arrays.fill(j,99);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));

        System.arraycopy(i,0,j,0,i.length);
        System.out.println("i = " + Arrays.toString(i));
        System.out.println("j = " + Arrays.toString(j));

        int[] k = new int[4];
        Arrays.fill(k,44);
        System.arraycopy(i,0,k,1,k.length-1);
        System.out.println("k = " + Arrays.toString(k));
    }
}
