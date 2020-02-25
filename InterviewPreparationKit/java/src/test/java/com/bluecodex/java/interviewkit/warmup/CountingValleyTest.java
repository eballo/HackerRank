package com.bluecodex.java.interviewkit.warmup;

import org.junit.Assert;
import org.junit.Test;

public class CountingValleyTest {

    @Test
    public void countingValley1(){

        int count = CountingValley.countingValleys(8, "UDDDUDUU");

        Assert.assertEquals(1, count);
    }

}