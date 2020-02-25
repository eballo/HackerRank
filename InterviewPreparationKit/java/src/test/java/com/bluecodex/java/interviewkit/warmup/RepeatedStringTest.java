package com.bluecodex.java.interviewkit.warmup;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedStringTest {

    @Test
    public void repeatedString() {

        long ocurrences = RepeatedString.repeatedString("abcac", 10);

        Assert.assertEquals(4, ocurrences);
    }

    @Test
    public void repeatedString2() {

        long ocurrences = RepeatedString.repeatedString("aba", 10);

        Assert.assertEquals(7, ocurrences);
    }

    @Test
    public void repeatedString3() {

        long ocurrences = RepeatedString.repeatedString("a", 1000000000000L);

        Assert.assertEquals(1000000000000L, ocurrences);
    }
}