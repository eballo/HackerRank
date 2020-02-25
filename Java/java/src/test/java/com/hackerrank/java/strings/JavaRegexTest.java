package com.hackerrank.java.strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaRegexTest {

    @Test
    public void validateValidIps() {
        Assert.assertTrue(JavaRegex.validate("000.12.12.034"));
        Assert.assertTrue(JavaRegex.validate("121.234.12.12"));
        Assert.assertTrue(JavaRegex.validate("23.45.12.56"));

    }

    @Test
    public void validateInvalidIps(){
        Assert.assertFalse(JavaRegex.validate("000.12.234.23.23"));
        Assert.assertFalse(JavaRegex.validate("666.666.23.23"));
        Assert.assertFalse(JavaRegex.validate(".213.123.23.32"));
        Assert.assertFalse(JavaRegex.validate("23.45.22.32."));
        Assert.assertFalse(JavaRegex.validate("I.Am.not.an.ip"));
    }
}