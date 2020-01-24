package com.hackerrank.java.strings;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class JavaStringsIntroductionTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void solution() {
        JavaStringsIntroduction.solution("hello", "java");

        String[] result = systemOutRule.getLog().split("\n");

        assertEquals(result[0], "9");
        assertEquals(result[1], "No");
        assertEquals(result[2], "Hello Java");
    }
}