package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int x = 1; x <= 10; x++) {
            System.out.println(n + " x " + x + " = " + (n * x));
        }

        scanner.close();
    }
}
