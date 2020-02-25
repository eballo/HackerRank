package com.hackerrank.java.strings;

import com.hackerrank.java.HackerRankTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaStringReverseTest extends HackerRankTest {

    @Test
    public void solutionYes() {

        JavaStringReverse.solution("madam");

        String[] result = getOutputResult();
        assertEquals( "Yes", result[0]);
    }

    @Test
    public void solutionNo() {

        JavaStringReverse.solution("robert");

        String[] result = getOutputResult();
        assertEquals( "No", result[0]);
    }
}