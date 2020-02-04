package com.bluecodex.java;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppTest 
{
    @Test
    public void solution1() {

        List<Integer> listNumbers = Arrays.asList(1,2,3);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        App.solution(listNumbers, 2 , 0, listNumbers.size(), temp, result);

        System.out.println(result);

        Assert.assertEquals("[[1, 2], [1, 3], [2, 3]]", result.toString());
    }


    @Test
    public void solution2() {

        List<Integer> listNumbers = Arrays.asList(1,2,3,4);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        App.solution(listNumbers, 2 , 0, listNumbers.size(), temp, result);

        System.out.println(result);

        Assert.assertEquals("[[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]", result.toString());
    }

    @Test
    public void solution3() {

        List<Integer> listNumbers = Arrays.asList(1,2,3);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        App.solution(listNumbers, 3 , 0, listNumbers.size(), temp, result);

        System.out.println(result);

        Assert.assertEquals("[[1, 2, 3]]", result.toString());
    }

    @Test
    public void solution4() {

        List<Integer> listNumbers = Arrays.asList(1,2,3,4,5);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        App.solution(listNumbers, 3 , 0, listNumbers.size(), temp, result);

        System.out.println(result);

        Assert.assertEquals("[[1, 2, 3], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]", result.toString());
    }

}
