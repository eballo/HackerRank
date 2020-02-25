package com.hackerrank.java.strings;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(validate(IP));
        }
    }

    public static boolean validate(String IP) {
        return IP.matches(new MyRegex().pattern);
    }

}

/**
 * IP address is a string in the form "A.B.C.D",
 * 1) where the value of A, B, C, and D may range from 0 to 255.
 * 2) Leading zeros are allowed.
 * 3) The length of A, B, C, or D can't be greater than 3.
 */
class MyRegex {

    /**
     * ref:https://www.regular-expressions.info/numericranges.html
     *
     * fromZeroTo255
     *
     * [0-9]             matches 0 to 9.
     * [1-9][0-9]        matches 10 to 99
     * 1[0-9][0-9]       matches 100 to 199
     * 2[0-4][0-9]       matches 200 to 249
     * 25[0-5]           matches 250 to 255
     *
     * Because we need to match 000 (Leading zeros are allowed) also:
     *
     * [01]?[0-9]?[0-9] matches 0 or 000 to 199
     * 2[0-4][0-9]      matches 200to 249
     * 25[0-5]          matches 250 to 255
     *
     **/
    private String fromZeroTo255 = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";

    public String pattern = fromZeroTo255 + "." + fromZeroTo255 + "." + fromZeroTo255 + "." + fromZeroTo255 ;
}
