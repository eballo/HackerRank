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
}