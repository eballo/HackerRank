package com.hackerrank.java.exceptionhandling;

import org.junit.Assert;
import org.junit.Test;

public class JavaExceptionHandlingTryCatchTest {

    @Test
    public void compute() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.compute(10,3));
    }

    @Test(expected = ArithmeticException.class)
    public void computeError() {
        Solution solution = new Solution();
        Assert.assertEquals(3, solution.compute(10,0));
    }
}