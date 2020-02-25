package com.hackerrank.java.introduction;

import java.util.Scanner;

public class JavaStdinAndStdoutTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        solution(scan);
    }

    public static void solution(Scanner scan) {
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
