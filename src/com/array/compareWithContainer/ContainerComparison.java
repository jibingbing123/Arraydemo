package com.array.compareWithContainer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 数组和容器持有对象的方式都是类型检查性的
 * 不同在于:数组通过[]方式添加和访问元素,而List通过add()和get()方法
 * Created by jibingbing on 2017/11/29.
 */
public class ContainerComparison {
    public static void main(String[] args) {
        //数组和List持有对象
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0;i < 5;i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
        System.out.println("spheres.length: " + spheres.length);

        List<BerylliumSphere> sphereList = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

        //数组和List持有基本类型
        int[] integers = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(integers));
        System.out.println(integers[4]);

        List<Integer> intList = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        intList.add(97);
        System.out.println(intList);
        System.out.println(intList.get(4));
    }
}
