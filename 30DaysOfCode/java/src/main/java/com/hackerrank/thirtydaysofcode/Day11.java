package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day11 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void solution(int[][] array) {
        int total = 0, max = Integer.MIN_VALUE;

        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                total = calculate(array, x, y);
                if (total > max) {
                    max = total;
                }
            }
        }

        System.out.println(max);
    }

    public static int calculate(int[][] array, int x, int y) {
        return array[x + 0][y + 0] + array[x + 0][y + 1] + array[x + 0][y + 2] +
                array[x + 1][y + 1] +
                array[x + 2][y + 0] + array[x + 2][y + 1] + array[x + 2][y + 2];
    }

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        solution(arr);

        scanner.close();
    }

}
