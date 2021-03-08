package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }

}
    public static void main2(String[] args) {
       /* int a =10 ;
        a = a ++;
        System.out.println(a);*/
     /*   boolean flg = true ? true == true ? false : true : false ;
        System.out.println(flg);*/
    }

    public static void main1(String[] args) {
        /* *//* *//**//*  final byte a = 10;
       final byte b = 20;
       final byte c =(a + b);*//**//*
        int a = 10;
        String str = a +"";
        System.out.println(a);
        String ret = String.valueOf(a);
        System.out.println(a);
        String str1 = "123";
        int d = Integer.valueOf(str1);
        System.out.println(d);*//*


    }*/
    }
