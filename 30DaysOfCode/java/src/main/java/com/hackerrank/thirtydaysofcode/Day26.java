package com.hackerrank.thirtydaysofcode;

import java.util.Calendar;
import java.util.Scanner;

public class Day26 {

    public static void main(String[] args) {

        int fine = 0;

        Scanner sc = new Scanner(System.in);

        String returnedDate = sc.nextLine();
        String expectedDate = sc.nextLine();

        String[] returned = returnedDate.split(" ");
        String[] expected = expectedDate.split(" ");

//        for (int x = 0; x < 3; x++) {
//            System.out.println(returned[x]);
//            System.out.println(expected[x]);
//        }

        Calendar returnedC = Calendar.getInstance();
        returnedC.set(Integer.valueOf(returned[2]), Integer.valueOf(returned[1]) - 1, Integer.valueOf(returned[0]));

        Calendar expectedC = Calendar.getInstance();
        expectedC.set(Integer.valueOf(expected[2]), Integer.valueOf(expected[1]) - 1, Integer.valueOf(expected[0]));

//        System.out.println(returnedC.getTime());
//        System.out.println(expectedC.getTime());

        if (returnedC.getTimeInMillis() > expectedC.getTimeInMillis()) {
            if (returnedC.get(Calendar.YEAR) == expectedC.get(Calendar.YEAR)) {
                if (returnedC.get(Calendar.MONTH) == expectedC.get(Calendar.MONTH)) {
                    fine = 15 * (returnedC.get(Calendar.DAY_OF_MONTH) - expectedC.get(Calendar.DAY_OF_MONTH));
                } else {
                    fine = 500 * (returnedC.get(Calendar.MONTH) - expectedC.get(Calendar.MONTH));
                }
            } else {
                fine = 10000;
            }
        }else{
            fine = 0;
        }

        System.out.println(fine);

    }

}
