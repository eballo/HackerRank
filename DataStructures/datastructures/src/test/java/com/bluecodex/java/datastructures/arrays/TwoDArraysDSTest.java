package com.bluecodex.java.datastructures.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoDArraysDSTest {

    @Test
    public void hourglassSum() {

        int[][] array = {{-9,-9,-9,1,1,1},
                         {0,-9,0,4,3,2},
                         {-9,-9,-9,1,2,3},
                         {0,0,8,6,6,0},
                         {0,0,0,-2,0,0},
                         {0,0,1,2,4,0},
        };

        int maxValue = TwoDArraysDS.hourglassSum(array);
        System.out.println(maxValue);

        Assert.assertEquals(28, maxValue);

    }


    @Test
    public void hourglassSum2() {

        int[][] array = {{-1, -1, 0, -9, -2, -2},
                        {-2, -1, -6, -8, -2, -5},
                        {-1, -1, -1, -2, -3, -4},
                        {-1, -9, -2, -4, -4, -5},
                        {-7, -3, -3, -2, -9, -9},
                        {-1, -3, -1, -2, -4, -5},
        };

        int maxValue = TwoDArraysDS.hourglassSum(array);
        System.out.println(maxValue);

        Assert.assertEquals(-6, maxValue);

    }
}