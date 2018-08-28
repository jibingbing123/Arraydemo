package com.array.ArrayOptions;

import java.util.ArrayList;
import java.util.List;

/**
 * 如何在数组中使用泛型
 * Created by jibingbing on 2017/12/2.
 */
public class ArrayOfGenerics {
    public static void main(String[] args) {
//        不能创建实际的持有泛型的数组对象（只能声明泛型数组,不能直接初始化）
//        List<String>[] stringOfList = new List<String>[];
        List<String>[] stringList;
//        但是可以创建非泛型数组,然后将其转换为泛型数组
        List[] list = new List[10];
        stringList = (List<String>[])list;
//        编译没有错误
        stringList[0] = new ArrayList<String>();
//        stringList[1] = new ArrayList<Integer>(); 直接提示报错

        Object[] objects = stringList;
        objects[1] = new ArrayList<Integer>();
    }
}
