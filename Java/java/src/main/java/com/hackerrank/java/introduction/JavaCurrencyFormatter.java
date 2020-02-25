package com.hackerrank.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat usnf = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usnf.format(payment);
        NumberFormat nfin = NumberFormat.getCurrencyInstance(new Locale("en","in"));
        String india = nfin.format(payment);
        NumberFormat nfch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nfch.format(payment);
        NumberFormat nffr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nffr.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
