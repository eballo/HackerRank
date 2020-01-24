package com.hackerrank.java.strings;

import com.hackerrank.java.HackerRankTest;
import org.junit.Assert;
import org.junit.Test;

public class JavaAnagramsTest extends HackerRankTest {

    @Test
    public void isAnagram() {
        Assert.assertTrue(JavaAnagrams.isAnagram("anagram","margana"));
        Assert.assertFalse(JavaAnagrams.isAnagram("anagramm","marganaa"));
        Assert.assertTrue(JavaAnagrams.isAnagram("hello","hello"));
    }

}