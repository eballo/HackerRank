package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int ele = sc.nextInt();
            isPrime(ele);
        }

    }

    private static void isPrime(int ele) {
        boolean isPrime = true;

        if(ele>1){
            for(int x=2; (x * x)<=ele; x++){
                //System.out.println(x);
                //System.out.println(ele % x);
                if(ele % x == 0){
                    isPrime = false;
                }
            }
        }else{
            isPrime = false;
        }

        if(isPrime) {
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
