package com.example.demo.component;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class BigDicmalComponent {
    public static void main(String[] args) {
        BigDecimal first = new BigDecimal("1.12");
        BigDecimal second = new BigDecimal("2.24");
        //BigDecimal 加减乘除,常用的只有加减,乘除很少用
        //加
        BigDecimal add = first.add(second);
        System.out.println(add);
        //减
        BigDecimal subtract = first.subtract(second);
        if (subtract.compareTo(new BigDecimal("0.00")) == -1){
            System.out.println("负数");
        }else if (subtract.compareTo(new BigDecimal("0.00")) == 1){
            System.out.println("正数");
        }else {
            System.out.println("零");
        }
        System.out.println(subtract.abs());
        //乘
        BigDecimal multiply = first.multiply(second).setScale(2,RoundingMode.HALF_UP);
        System.out.println(multiply.toString());

       //除
        BigDecimal divide = first.divide(second, 2, RoundingMode.HALF_UP);
        System.out.println(divide);

        //百分比
        BigDecimal bigDecimal = divide.multiply(new BigDecimal("100")).setScale(0, RoundingMode.HALF_UP);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal+"%");
    }
}
