package com.hackerrank.java.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String textA, String textB) {
        boolean valueToReturn = false;

        if(textA!=null && textB!=null && textA.length() == textB.length()) {

            textA = textA.toLowerCase();
            textB = textB.toLowerCase();
            int size = textA.length();

            for(int x=0; x<size; x++){
                //Get the character
                char letterA = textA.charAt(x);
                //We will look for this character if exist in the other textB
                //if exist we will remove it, and at the end if textB is empty means that are equals.
                if(textB.indexOf(letterA)!=-1){
                    textB = textB.replaceFirst(String.valueOf(letterA), "");
                }else{
                    break;
                }
            }

            valueToReturn = (textB.length() == 0);
        }

        return valueToReturn;
    }

    /**
     * Map Version
     * @param textA
     * @param textB
     * @return
     */
    static boolean isAnagramMap(String textA, String textB) {
        boolean valueToReturn =false;

        if(textA!=null && textB!=null && textA.length()==textB.length()) {

            Map<String, Integer> mapA = new HashMap<>();
            Map<String, Integer> mapB = new HashMap<>();

            char[] lettersA = textA.toCharArray();
            char[] lettersB = textB.toCharArray();

            int length = textA.length();
            for (int x = 0; x < length; x++) {
                String letterA = String.valueOf(lettersA[x]);
                String letterB = String.valueOf(lettersB[x]);
                addToMap(mapA, letterA);
                addToMap(mapB, letterB);
            }

            System.out.println(mapA);
            System.out.println(mapB);

            valueToReturn = mapA.equals(mapB);
        }

        return valueToReturn;
    }

    static  void addToMap(Map<String,Integer> map, String letter){
        if(map.get(letter)!=null){
            int value = map.get(letter);
            map.put(letter,value+1);
        }else{
            map.put(letter,0);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
