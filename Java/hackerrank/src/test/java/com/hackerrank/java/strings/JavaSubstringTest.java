package com.hackerrank.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaSubstringTest extends HackerRankTest{

    @Test
    public void solution() {
        JavaSubstring.solution("Helloworld", 3, 7);

        String [] result = systemOutRule.getLog().split("\n");
        assertEquals("lowo", result[0]);
    }
}