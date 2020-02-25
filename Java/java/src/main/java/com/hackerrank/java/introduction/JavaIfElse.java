package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void solution(int n) {
        //If  is even
        if(n % 2 == 0){
            //and in the inclusive range of 2 to 5, print Not Weird
            if((2 <= n) && (n <= 5)){
                System.out.println("Not Weird");
                //If  is even and in the inclusive range of 6 to 20 , print Weird
            }else if((6 <= n) && (n <= 20 )){
                System.out.println("Weird");
            }else if( n > 20){
                System.out.println("Not Weird");
            }
        }else{
            //it is odd
            System.out.println("Weird");
        }
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solution(N);

        scanner.close();
    }

}
