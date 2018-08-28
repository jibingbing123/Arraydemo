package com.array.arrayWithGenerics;

/**
 * 通过给方法加泛型来确定返回数组的类型
 * Created by jibingbing on 2017/12/2.
 */
public class MethodParameter {
    public <T> T[] f(T[] arg){
        return arg;
    }
}
