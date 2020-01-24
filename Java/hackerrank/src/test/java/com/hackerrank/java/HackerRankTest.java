package com.hackerrank.java;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;

public class HackerRankTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    public String[] getOutputResult() {
        return systemOutRule.getLog().split("\n");
    }
}
