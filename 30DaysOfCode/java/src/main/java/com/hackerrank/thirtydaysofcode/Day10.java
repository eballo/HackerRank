package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day10 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String binary = Integer.toBinaryString(n);

        //System.out.println(binary);

        int count = 0, max = 0;
        for (int x = 0; x < binary.length(); x++) {

            if (String.valueOf(binary.charAt(x)).equals("1")) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }

        }
        System.out.println(max);

        scanner.close();
    }

}
