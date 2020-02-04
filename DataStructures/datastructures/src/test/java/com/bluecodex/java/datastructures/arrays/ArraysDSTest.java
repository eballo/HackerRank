package com.bluecodex.java.datastructures.arrays;

import com.bluecodex.java.datastructures.arrays.ArraysDS;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ArraysDSTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        int[] a = {1, 2, 3, 4};

        int[] b = ArraysDS.reverseArray(a);

        for (int x = 0; x < b.length; x++) {
            System.out.println(b[x]);
        }
    }
}
