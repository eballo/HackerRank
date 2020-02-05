package com.bluecodex.java.interviewkit.warmup;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JumpingOnTheCloudsTest {

    @Test
    public void jumpingOnClouds1() {
        int [] clouds = {0, 0, 1, 0, 0, 1, 0};
        int minJumps = JumpingOnTheClouds.jumpingOnClouds(clouds);

        Assert.assertEquals(4, minJumps);
    }

    @Test
    public void jumpingOnClouds2() {
        int [] clouds = {0, 1, 0, 0, 0, 1, 0};
        int minJumps = JumpingOnTheClouds.jumpingOnClouds(clouds);

        Assert.assertEquals(3, minJumps);
    }
}