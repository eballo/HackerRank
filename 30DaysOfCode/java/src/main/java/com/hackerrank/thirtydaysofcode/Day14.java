package com.hackerrank.thirtydaysofcode;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
        this.maximumDifference = Integer.MIN_VALUE;
    }

    public void computeDifference() {
        int current;
        for (int x = 0; x < elements.length; x++) {
            for (int y = 1; y < elements.length; y++) {
                current = Math.abs(elements[x] - elements[y]);
                if (current > maximumDifference) {
                    maximumDifference = current;
                }
            }
        }
    }

} // End of Difference class

public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }

}
