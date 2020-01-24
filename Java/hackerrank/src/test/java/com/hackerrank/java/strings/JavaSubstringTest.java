package com.hackerrank.java.strings;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class JavaSubstringTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void solution() {
        JavaSubstring.solution("Helloworld", 3, 7);

        String [] result = systemOutRule.getLog().split("\n");
        assertEquals("lowo", result[0]);
    }
}