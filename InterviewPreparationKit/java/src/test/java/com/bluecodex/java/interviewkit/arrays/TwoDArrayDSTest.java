package com.bluecodex.java.interviewkit.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDArrayDSTest {

    @Test
    public void hourglassSum() {
        int [][] array = {
                        {1, 1, 1, 0, 0, 0},
                        {0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 0, 0, 0},
                        {0, 0, 2, 4, 4, 0},
                        {0, 0, 1, 2, 0, 0},
                        {0, 0, 1, 2, 4, 0}
        };

        int maxSum = TwoDArrayDS.hourglassSum(array);

        Assert.assertEquals(19, maxSum);
    }

    @Test
    public void hourglassSum2() {
        int [][] array = {
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 9, 2, -4, -4, 0},
                {0, 0, 1, -2, 0, 0},
                {0, 0, -1, -2, -4, 0}
        };

        int maxSum = TwoDArrayDS.hourglassSum(array);

        Assert.assertEquals(13, maxSum);
    }
}