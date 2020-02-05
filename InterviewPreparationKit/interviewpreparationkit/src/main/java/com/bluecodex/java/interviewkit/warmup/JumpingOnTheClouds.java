package com.bluecodex.java.interviewkit.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int size = c.length;
        int jumps = -1; // because when the condition is not meet in the loop we will increment a jump before going out I will start with a negative value

        for(int x = 0; x<c.length; x++){
            if(x<size-2 && c[x+2]==0 ){ // If we can jump 2 times we will do it always because is the fastest way
                x ++; // double jump increment here and in the for loop
            }
            jumps++;
        }

        return jumps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
