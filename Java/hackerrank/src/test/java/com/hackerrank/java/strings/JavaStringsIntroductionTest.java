package com.hackerrank.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaStringsIntroductionTest extends HackerRankTest{

    @Test
    public void solution() {
        JavaStringsIntroduction.solution("hello", "java");

        String[] result = systemOutRule.getLog().split("\n");

        assertEquals( "9", result[0]);
        assertEquals( "No",result[1]);
        assertEquals( "Hello Java", result[2]);
    }
}