package com.hackerrank.java.strings;

import com.hackerrank.java.HackerRankTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaSubstringTest extends HackerRankTest {

    @Test
    public void solution() {
        JavaSubstring.solution("Helloworld", 3, 7);

        String [] result = getOutputResult();
        assertEquals("lowo", result[0]);
    }
}