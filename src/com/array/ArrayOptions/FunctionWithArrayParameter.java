package com.array.ArrayOptions;

import com.array.compareWithContainer.BerylliumSphere;

import java.util.Arrays;

/**
 * 创建一个参数为BerylliumSphere[]数组类型的参数,并动态的创建参数去调用这个方法.
 * 证明在本例中普通的聚集数组初始化不能奏效.
 * Created by jibingbing on 2017/11/29.
 */
public class FunctionWithArrayParameter {
    public void hide(BerylliumSphere[] berylliumSpheres){
        System.out.println(Arrays.toString(berylliumSpheres));
    }

    public static void main(String[] args) {
        FunctionWithArrayParameter fwap = new FunctionWithArrayParameter();
        fwap.hide(new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()});
        BerylliumSphere[] d = {new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
        fwap.hide(d);
    }
}
