package com.hackerrank.java.strings;

import com.hackerrank.java.HackerRankTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaSubstringComparisonsTest extends HackerRankTest {

    @Test
    public void getSmallestAndLargest() {
        System.out.println(JavaSubstringComparisons.getSmallestAndLargest("welcometojava",3));

        String [] result = getOutputResult();
        assertEquals("ava",result[0]);
        assertEquals("wel",result[1]);
    }

    @Test
    public void getSmallestAndLargestWrongValue(){
        String text ="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int size = 30;

        System.out.println(JavaSubstringComparisons.getSmallestAndLargest(text,size));

        String [] result = getOutputResult();
        assertEquals("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdl",result[0]);
        assertEquals("sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs",result[1]);

    }
}