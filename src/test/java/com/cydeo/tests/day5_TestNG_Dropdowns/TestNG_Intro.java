package com.cydeo.tests.day5_TestNG_Dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro  {

    @BeforeClass
    public void setUpMethod(){
        System.out.println("-------->Before class running!");
    }
    @AfterClass
    public void tearDownMethod(){
        System.out.println("-------->After class running!");
    }
    @BeforeMethod
    public void setUp(){
        System.out.println("Before method is running!");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method is running!");
    }
    @Test(priority = 1)
    public  void test1 (){
        System.out.println("Test 1 is running...");

        String actual="apple";
        String expected="apple";

        Assert.assertEquals(actual,expected);

    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("Test 2 is running...");

        String actual="apple";
        String expected="apple";

        Assert.assertTrue(actual.equals(expected));
    }

}
