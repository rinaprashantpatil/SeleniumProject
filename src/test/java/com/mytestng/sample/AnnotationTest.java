package com.mytestng.sample;

import org.testng.annotations.*;

public class AnnotationTest {
    @Test
    public void testcase1(){
        System.out.println("In test case 1");
    }
    @Test
    public void testcase2(){
        System.out.println("In test case 2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("In beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("In afterMethod");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("In beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("In afterClass");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("In beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("In afterSuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("In beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("In afterTest");
    }
}
