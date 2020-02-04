package com.bluecodex.java.datastructures;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        int [] a ={1,2,3,4};

        int []b = App.reverseArray(a);

        for(int x=0; x<b.length; x++){
            System.out.println(b[x]);
        }
    }
}
