package com.hackerrank.java.strings;

import java.util.Scanner;

public class JavaSubstring {

    public static void solution(String s, int start, int end) {
        System.out.println(s.substring(start,end));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        solution(S, start, end);
    }
}
