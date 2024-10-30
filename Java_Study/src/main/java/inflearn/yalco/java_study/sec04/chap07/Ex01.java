package inflearn.yalco.java_study.sec04.chap07;

import java.util.Scanner;
//import java.lang.System;

public class Ex01 {
    public static void main(String[] args) {
        //  IDE가 최상단에 import java.util.Scanner 자동 작성
        Scanner sc = new Scanner(System.in);

        //  텍스트에서 스페이스나 tab등의 단위(공백)로 끊어서 구분
        String str1 = sc.next();
        String str2 = sc.next();
        //  줄 바꿈 단위(엔터)로 끊어서 구분
        String str3 = sc.nextLine();
        String str4 = sc.nextLine();

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

    }
}
