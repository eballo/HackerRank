package com.hackerrank.thirtydaysofcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<String, Integer> map;
        map = new HashMap<String, Integer>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            map.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            Integer phone = map.get(s);
            if (phone != null) {
                System.out.println(s + "=" + phone);
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
