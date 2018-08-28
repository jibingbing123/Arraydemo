package com.array.arrayWithGenerics;

/**
 * 通过给类加泛型来确定返回的数组类型
 * Created by jibingbing on 2017/12/2.
 */
public class ClassParameter<T> {
    public T[] f(T[] arg){
        return arg;
    }
}
