package com.hackerrank.java.strings;

import com.hackerrank.java.HackerRankTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringTokensTest extends HackerRankTest {

    @Test
    public void solution() {

        JavaStringTokens.solution("He is a very very good boy, isn't he?");

        String [] result = getOutputResult();
        Assert.assertEquals("10", result[0]);
        Assert.assertEquals("He", result[1]);
        Assert.assertEquals("is", result[2]);
        Assert.assertEquals("a", result[3]);
        Assert.assertEquals("very", result[4]);
        Assert.assertEquals("very", result[5]);
        Assert.assertEquals("good", result[6]);
        Assert.assertEquals("boy", result[7]);
        Assert.assertEquals("isn", result[8]);
        Assert.assertEquals("t", result[9]);
        Assert.assertEquals("he", result[10]);

    }

    @Test
    public void solutionWrong(){
        JavaStringTokens.solution("           YES      leading spaces        are valid,    problemsetters are         evillllll");

        String [] result = getOutputResult();
        Assert.assertEquals("8", result[0]);
        Assert.assertEquals("YES", result[1]);
        Assert.assertEquals("leading", result[2]);
        Assert.assertEquals("spaces", result[3]);
        Assert.assertEquals("are", result[4]);
        Assert.assertEquals("valid", result[5]);
        Assert.assertEquals("problemsetters", result[6]);
        Assert.assertEquals("are", result[7]);
        Assert.assertEquals("evillllll", result[8]);
    }


    @Test
    public void solutionWrong2(){
        JavaStringTokens.solution("      aaa     ^      * spaces        are valid,    problemsetters are         evillllll");

        String [] result = getOutputResult();
        Assert.assertEquals("0", result[0]);

    }

    @Test
    public void solutionWrongEmpty(){
        JavaStringTokens.solution(" ");

        String [] result = getOutputResult();
        Assert.assertEquals("0", result[0]);

    }
}