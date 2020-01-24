package com.hackerrank.java.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    private static String capitalize(String text){
        return text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();
    }

    public static void solution(String a, String b) {
        int sizeA = a.length();
        int sizeB = b.length();

        System.out.println(sizeA + sizeB);
        System.out.println((a.compareTo(b)>0)?"Yes":"No");
        System.out.println(capitalize(a)+" "+capitalize(b));
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        solution(A, B);

    }
}
