package com.bluecodex.java.interviewkit.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SockMerchant
{
    // Complete the sockMerchant function below.
    public static int sockMerchant(int n, int[] ar) {

        boolean [] bolArray = new boolean[n];
        int count = 0;
        for(int x = 0; x<n; x++){
            for(int y = x+1; y<n; y++){
                if(ar[x] == ar[y] && (bolArray[y]==false && bolArray[x]==false)){
                    bolArray[x]=true;
                    bolArray[y]=true;
                    count ++;
                    continue;
                }
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
