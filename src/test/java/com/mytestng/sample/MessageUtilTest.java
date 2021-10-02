package com.mytestng.sample;

import com.mycode.MessageUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MessageUtilTest {
    String message="anita";
    MessageUtil messageutil=new MessageUtil(message);
    @Test
    public void testPrintMessage(){
        System.out.println("inside testPrintMessage");
        message="anita";
        Assert.assertEquals(message,messageutil.printMessage());
    }
}
