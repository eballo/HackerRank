package com.bluecodex.java.interviewkit.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void rotLeft() {

        int [] array ={1,2,3,4,5};
        int [] sol = LeftRotation.rotLeft(array, 4);

        int [] expect = {5,1,2,3,4};
        for(int x=0; x<sol.length; x++){
         Assert.assertEquals(expect[x], sol[x]);
        }

    }
}