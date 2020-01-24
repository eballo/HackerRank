package com.hackerrank.java.strings;

import com.hackerrank.java.HackerRankTest;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternSyntaxCheckerTest extends HackerRankTest {

    @Test
    public void validatePattern() {
        PatternSyntaxChecker.validatePattern("([A-Z])(.+)");

        String [] result = getOutputResult();
        Assert.assertEquals("Valid", result[0]);
    }

    @Test
    public void validatePattern2() {
        PatternSyntaxChecker.validatePattern("[AZ[a-z](a-z)");

        String [] result = getOutputResult();
        Assert.assertEquals("Invalid", result[0]);
    }

    @Test
    public void validatePattern3() {
        PatternSyntaxChecker.validatePattern("batcatpat(nat");

        String [] result = getOutputResult();
        Assert.assertEquals("Invalid", result[0]);
    }


    @Test
    public void validatePattern4() {
        PatternSyntaxChecker.validatePattern("");

        String [] result = getOutputResult();
        Assert.assertEquals("Invalid", result[0]);
    }
}