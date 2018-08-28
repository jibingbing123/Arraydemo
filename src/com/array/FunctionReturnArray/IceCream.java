package com.array.FunctionReturnArray;

import java.util.Arrays;
import java.util.Random;

/**
 * 一个方法可以直接返回数组,数组使用完毕,垃圾回收器负责清理数组;只要还需要它,此数组就会一直存在
 * Created by jibingbing on 2017/12/1.
 */
public class IceCream {
    private static Random random = new Random(47);
    private static final String[] FLOWERS = {"Chocolate","Strawberry","Vanilla Fudge Swirl",
            "Mint Chip","Mocha Alomond Fudge","Rum Raisin","Praline Cream","Mud Pie"};

    public static String[] flowerSet(int n){
        if(n > FLOWERS.length){
            throw new IllegalArgumentException("Set too big");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLOWERS.length];

        for(int i = 0;i < n;i++){
            int t;

            do{
                t = random.nextInt(FLOWERS.length);
            }while (picked[t]);

            results[i] = FLOWERS[t];
            picked[t] = true;
        }
        return results;
    }

    public static void main(String[] args) {
        for(int i = 0;i < 7;i++){
            System.out.println(Arrays.toString(flowerSet(3)));
        }
    }
}
