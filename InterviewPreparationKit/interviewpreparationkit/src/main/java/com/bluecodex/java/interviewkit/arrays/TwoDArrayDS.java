package com.bluecodex.java.interviewkit.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDArrayDS {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for(int x=0; x<4; x++){
            for(int y=0; y<4; y++){
                int sum = calculateSum(arr, x , y);
                if(sum>maxSum) maxSum = sum;
            }
        }

        return maxSum;
    }

    private static int calculateSum(int[][] arr, int x, int y) {
        return  arr[x+0][y+0] + arr[x+0][y+1] + arr[x+0][y+2] +
                                arr[x+1][y+1] +
                arr[x+2][y+0] + arr[x+2][y+1] + arr[x+2][y+2];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
