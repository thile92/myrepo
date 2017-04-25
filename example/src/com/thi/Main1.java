package com.thi;

import com.thi1.ExtraCalculator;

/**
 * Created by ThiLH on 4/14/2017.
 */
public class Main1 {

    public static void main(String[] args) {
        int a = Integer.valueOf(args[0]);
        int b = Integer.valueOf(args[1]);
        System.out.println("Run calculator: " + Calculator.calculate(a, b));

        System.out.println("Run calculator ver 1: " + ExtraCalculator.calculate(a, b));
    }

}
