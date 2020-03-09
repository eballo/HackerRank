package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day29 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);

            int maxValue = 0, current =0;
            for(int x=0; x<=n; x++){
                for(int y = x +1; y<=n; y++){
                    current = x & y;
                    if (current > maxValue && current < k) {
                        maxValue = current;
                    }
                }
            }
            System.out.println(maxValue);

        }

        scanner.close();
    }

}
