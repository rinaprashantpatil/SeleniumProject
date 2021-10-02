package com.mytestng.sample;

import com.mycode.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StringUtilsTest {
    @Test
    public void testRever() {
        String input= "Jayesh";
        String actualOutput = StringUtils.reverseString(input);
        Assert.assertEquals(actualOutput, "hseyaJ");
    }
    @Test
    public void nullTest() {
        String actualOutput = StringUtils.reverseString(null);
        Assert.assertEquals(actualOutput, "");

    }

    @Test
    @Parameters({"inputStr", "expectedStr"})
    public void paramTest(String inputStr, String expectedStr) {
        String actualOutput = StringUtils.reverseString(inputStr);
        Assert.assertEquals(actualOutput, expectedStr);
    }
    /*
    7987 =>
    546456##%=>
    ADSDFSFS=>
    ______=>

     */
}
