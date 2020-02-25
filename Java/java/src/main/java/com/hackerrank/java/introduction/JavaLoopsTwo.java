package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaLoopsTwo {

    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int x = 0;
            for(int j=0; j<n; j++){
                x += ((Math.pow(2,j)*b));
                System.out.printf("%d ", a+x);
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
