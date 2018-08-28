package com.array.arrayWithGenerics;

import java.util.Arrays;

/**
 * 使用参数化方法而不使用参数化类的方便之处在于:
 * 你不必需要为每种数组类型都实例化一个类,并且可以将实例化方法定义成静态的;
 * 虽然不应该总是使用参数化方法,但至少这种方法应该成为首选
 * Created by jibingbing on 2017/12/2.
 */
public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer[] ints = {1,2,3,4,5};
        Double[] doubles = {1.1,1.2,1.3,1.4};
        //通过参数化类来确定数组的类型为
        Integer[] ints2 = new ClassParameter<Integer>().f(ints);
        Double[] doubles2 = new ClassParameter<Double>().f(doubles);
        //通过参数化方法来确定数组的类型
        Integer[] ints3 = new MethodParameter().f(ints);
        Double[] doubles3 = new MethodParameter().f(doubles);

        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(doubles2));

        System.out.println(Arrays.toString(ints3));
        System.out.println(Arrays.toString(doubles3));
    }
}
