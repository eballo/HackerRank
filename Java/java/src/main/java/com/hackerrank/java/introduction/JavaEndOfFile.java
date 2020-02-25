package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.printf("%d %s\n", x, s);
            x++;
        }

    }
}
