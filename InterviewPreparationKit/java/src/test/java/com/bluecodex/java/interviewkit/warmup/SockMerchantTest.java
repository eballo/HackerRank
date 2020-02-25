package com.bluecodex.java.interviewkit.warmup;

import com.bluecodex.java.interviewkit.warmup.SockMerchant;
import org.junit.Assert;
import org.junit.Test;

public class SockMerchantTest
{

    @Test
    public void sockMerchant1()
    {
        int [] ar = {1,2,1,2,1,3,2};
        int numberOfPairs = SockMerchant.sockMerchant(7, ar);

        Assert.assertEquals(2, numberOfPairs);
    }

    @Test
    public void sockMerchant2()
    {
        int [] ar = {10,20,20,10,10,30,50,10,20};
        int numberOfPairs = SockMerchant.sockMerchant(9, ar);

        Assert.assertEquals(3, numberOfPairs);
    }
}
