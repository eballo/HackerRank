package com.hackerrank.java.strings;

import java.util.Scanner;

public class JavaStringReverse {

    public static void solution(String initial) {
        String reversed = new StringBuffer(initial).reverse().toString();

        if(reversed.equals(initial)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String initial = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        solution(initial);
    }
}
