package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int x = 0; x < n; x++) {
            String odd = "";
            String even = "";
            String text = scanner.nextLine();
            for (int y = 0; y < text.length(); y++) {
                if (y % 2 == 0) {
                    even += text.charAt(y);
                } else {
                    odd += text.charAt(y);
                }
            }
            System.out.println(even + " " + odd);
        }
    }

}
