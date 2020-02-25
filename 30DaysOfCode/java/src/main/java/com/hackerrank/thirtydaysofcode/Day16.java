package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

public class Day16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int value = Integer.valueOf(S);
            System.out.println(value);
        }catch(Exception e){
            System.out.println("Bad String");
        }

    }

}
