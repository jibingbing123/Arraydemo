package com.array.compareWithContainer;

/**
 * 数组和容器存放的对象类型
 * Created by jibingbing on 2017/11/29.
 */
public class BerylliumSphere {
    private static long count;
    private final long id = count++;//每实例化一个对象,id就会加1

    public String toString(){
        return "Sphere " + id;//这样就可以标识每个不同的实例
    }
}
