package com.example.demo.component;

import java.text.NumberFormat;

public class InaccurateComponent {
    /**
     * 适用于 int,long,double,float(整数一般使用int,小数一般使用double)
     * @param args
     */
    public static void main(String[] args) {
        //int: 整数除法和百分比的时候,需要先把整数转换为浮点型,防止隐式转换
        int first = 1;
        int second = 3;
        //加
        int add = first + second;
        //减
        int subtract = first - second;
        //乘
        int multiply = first*second;
        //除
        double divide = (double)first/(double)second;
        //百分比
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        String format = numberFormat.format(((double) first/(double) second)*100);
        
        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println("百分比:" + format + "%");

    }
}
