package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsOne {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int x=1;x<=10; x++){
            System.out.printf("%d x %d = %d\n", N, x, (N*x));
        }
        scanner.close();
    }
}
