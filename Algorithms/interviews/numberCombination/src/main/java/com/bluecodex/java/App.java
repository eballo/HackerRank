package com.bluecodex.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array N find all possible combinations of given length K
 *
 * example: N[1,2,3], k=2
 *
 * Solution: S[{1,2},{1,3},{2,3}]
 *
 */
public class App {

    public static void main( String[] args ){
        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        solution(listNumbers, 2, 0, listNumbers.size(), temp, result);
    }

    public static void solution(List<Integer> listNumbers, int k, int startPosition, int size, List<Integer> subSet, List<List<Integer>> result ){

        if( k > size){
            System.out.println("ERROR! k length is bigger than the size of the array!");
            return;
        }

        if( k == 0 ){
            result.add(new ArrayList<>(subSet));
            System.out.println("Finish");
            return;
        }

        for(int x = startPosition; x < size; x++){
            System.out.println("x: "+x);
            subSet.add(listNumbers.get(x));
            System.out.println("   Calling Solution again with : k="+ (k-1) + " startPosition=" + x + " subset="+subSet+" result="+result);
            solution(listNumbers, k - 1, x + 1, size, subSet, result );
            System.out.println("Removing last element");
            subSet.remove(subSet.size()-1);
        }
    }
}
