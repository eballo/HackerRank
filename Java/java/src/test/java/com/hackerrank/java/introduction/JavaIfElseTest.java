package com.hackerrank.java.introduction;

import com.hackerrank.java.HackerRankTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaIfElseTest extends HackerRankTest {

    @Test
    public void solutionWeirdOdd() {
        JavaIfElse.solution(3);

        String [] result= getOutputResult();
        assertEquals("Weird",result[0]);
    }

    @Test
    public void solutionNotWeird2_5Even() {
        JavaIfElse.solution(4);

        String [] result= getOutputResult();
        assertEquals("Not Weird",result[0]);
    }

    @Test
    public void solutionNotWeird6_20Even() {
        JavaIfElse.solution(8);

        String [] result= getOutputResult();
        assertEquals("Weird",result[0]);
    }

    @Test
    public void solutionNotWeirdBigger20Even() {
        JavaIfElse.solution(24);

        String [] result= getOutputResult();
        assertEquals("Not Weird",result[0]);
    }
}