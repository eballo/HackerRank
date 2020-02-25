package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator2 implements AdvancedArithmetic {
    public int divisorSum(int n) {
        int total = 0;
        for (int x = 1; x <= n; x++) {
            if (n % x == 0) {
                total = total + x;
            }
        }
        return total;
    }
}

public class Day19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator2();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
