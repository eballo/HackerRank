package com.hackerrank.java.introduction;

import com.hackerrank.java.HackerRankTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WelcomeToJavaTest extends HackerRankTest {

    @Test
    public void solution() {
        WelcomeToJava.solution();

        String [] result = getOutputResult();
        assertEquals("Hello, World.", result[0]);
        assertEquals("Hello, Java.", result[1]);
    }

}