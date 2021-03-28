package com.jxl.ch2.语句和控制结构;

import java.util.Scanner;

public class unicode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char c = '\u03B6';
        for(int i=0;i<10;i++) {
            System.out.print(c+" ");
            c+=i;
        }

        String uni=sc.nextLine();
        char[] uarr=uni.toCharArray();
        char rs=' ';
        for(int i=0;i<uarr.length;i++)
            rs+=uarr[i];
        System.out.println(rs);
    }

}
