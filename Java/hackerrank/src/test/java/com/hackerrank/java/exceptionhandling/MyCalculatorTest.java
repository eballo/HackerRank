package com.hackerrank.java.exceptionhandling;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyCalculatorTest {

    @Test
    public void power() throws Exception {
        MyCalculator m = new MyCalculator();
        Assert.assertEquals(243,m.power(3,5));
    }

    @Test(expected = Exception.class)
    public void powerNegative() throws Exception {
        MyCalculator m = new MyCalculator();
        m.power(-3,5);
    }

    @Test(expected = Exception.class)
    public void powerNegative2() throws Exception {
        MyCalculator m = new MyCalculator();
        m.power(3,-5);
    }

    @Test(expected = Exception.class)
    public void powerZero() throws Exception {
        MyCalculator m = new MyCalculator();
        m.power(0,0);
    }
}