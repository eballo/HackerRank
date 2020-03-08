package com.hackerrank.thirtydaysofcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];
            String emailID = firstNameEmailID[1];

            String myRegExString = "^([a-zA-Z.]+)@gmail.com$";
            Pattern p = Pattern.compile(myRegExString);
            Matcher m = p.matcher(emailID);

            if( m.find() ) {
                namesList.add(firstName);
            }

        }

        Collections.sort(namesList);
        for(String name: namesList){
            System.out.println(name);
        }

        scanner.close();
    }

}
