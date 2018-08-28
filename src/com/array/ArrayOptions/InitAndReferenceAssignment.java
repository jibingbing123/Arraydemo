package com.array.ArrayOptions;

import com.array.compareWithContainer.BerylliumSphere;

import java.util.Arrays;

/**
 * 数组的几种初始化方式和数组引用赋值
 * length是数组的大小,而不是实际保存的元素个数
 * Created by jibingbing on 2017/11/29.
 */
public class InitAndReferenceAssignment {
    public static void main(String[] args) {
        //*******************持有对象类型的数组**********************
        BerylliumSphere[] a;
        //使用这种方式,可以在任意地方创建和初始化数组
        BerylliumSphere[] b = new BerylliumSphere[5];

        System.out.println("Array of b: " + Arrays.toString(b));

        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0;i < c.length;i++){
            c[i] = new BerylliumSphere();
        }
        //这种方式初始化数组,只能在定义d的地方使用
        BerylliumSphere[] d = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
        //动态初始化数组a
        a = new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};

        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);

        a = d;
        System.out.println("after a = b,a.length = " + a.length);
        //*******************持有基本数据类型的数组**********************
        int[] e;
        int[] f = new int[5];

        System.out.println("Array of f:" + Arrays.toString(f));

        int[] g = new int[4];
        for (int i = 0;i < g.length;i++){
            g[i] = i * i;
        }

        int[] h = {1,2,3};
        e = new int[]{1,2};

        System.out.println("e.length = " + e.length);
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);

        e = h;
        System.out.println("after e = h,e.length = " + e.length);
    }
}
