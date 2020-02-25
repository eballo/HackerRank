package com.bluecodex.java.interviewkit.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

    // Complete the repeatedString function below.
    //
    // My first solution was failing with the case 1000000000000L
    // So I completely change the approach
    // I will calculate how many 'a' there are in the given string and then multiply the value repeated times
    // instead of creating a huge string
    static long repeatedString(String s, long n) {
        long total = 0;
        int totalAs = 0;
        int totalAsReminder = 0;
        int textSize = s.length();

        long division = n / textSize;
        int reminder = (int) (n % textSize);

        for(int x=0; x<textSize; x++){
            if(s.charAt(x)=='a') totalAs++;
        }

        if(reminder!=0){
            for(int x=0; x<reminder; x++){
                if(s.charAt(x)=='a') totalAsReminder++;
            }
        }

        total = (totalAs * division) + totalAsReminder;

        return total;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
