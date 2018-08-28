package com.array.methodOfArray;

import javax.annotation.Generated;
import java.util.Random;

/**
 * Created by jibingbing on 2017/12/3.
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    public CompType(int i,int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if(count++ % 3 == 0){
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType o) {
        return i < o.i ? -1 : (i == o.i ? 0 : 1);
    }


    public static void main(String[] args) {

    }

}

