package com.hackerrank.java.strings;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

    static void solution(String s){
        s = s.trim();
        //Check the given string
        if(!s.matches("[A-Za-z !,?._'@]+")){
            System.out.println(0);
        }else {
            String[] tokens = s.split("[^a-zA-Z]+");

            System.out.println(tokens.length);
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        // Write your code here.
        solution(s);

        scan.close();
    }

}
