package com.hackerrank.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {

            Scanner scan = new Scanner(System.in);
            int a = scan.nextInt();
            int b = scan.nextInt();

            Solution solution = new Solution();
            System.out.println(solution.compute(a, b));

        }catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

class Solution {
    public int compute(int x, int y) {
        return x / y;
    }
}
