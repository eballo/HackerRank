package com.hackerrank.java.exceptionhandling;

import java.util.Scanner;

public class JavaExceptionHandling {

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    /*
     * Create the method long power(int, int) here.
     */
    public int power(int number, int power) throws Exception {
        if(number < 0 || power < 0){
            throw new Exception("n or p should not be negative.");
        }else if(number == 0 && power == 0){
            throw new Exception("n and p should not be zero.");
        }else{
            return (int) Math.pow(number,power);
        }
    }
}
