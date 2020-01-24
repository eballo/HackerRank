package com.hackerrank.java.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringReverseTest extends HackerRankTest{

    @Test
    public void solutionYes() {

        JavaStringReverse.solution("madam");

        String[] result = systemOutRule.getLog().split("\n");
        assertEquals( "Yes", result[0]);
    }

    @Test
    public void solutionNo() {

        JavaStringReverse.solution("robert");

        String[] result = systemOutRule.getLog().split("\n");
        assertEquals( "No", result[0]);
    }
}