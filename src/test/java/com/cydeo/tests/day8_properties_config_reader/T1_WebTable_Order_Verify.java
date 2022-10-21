package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTable_Order_Verify {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");
    }

    @Test
    public void order_name_verify_test(){
        WebElement tableValue1= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[2]"));
        Assert.assertEquals(tableValue1.getText(),"Bob Martin");

        WebElement tableValue2= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[7]/td[5]"));
        Assert.assertEquals(tableValue2.getText(),"12/31/2021");
    }

    @Test
    public void test2(){
        System.out.println(WebTableUtils.returnOrderDate(driver,"Bob Martin"));

        WebTableUtils.orderVerify(driver,"Bob Martin","12/31/2021");

    }

    @AfterMethod
    public void quitMethod(){
        driver.quit();
    }


    //TC #1: Web table practice
    // 1. Go to: https://practice.cydeo.com/web-tables
    //2. Verify Bob’s name is listed as expected.
    //Expected: “Bob Martin”
    //3. Verify Bob Martin’s order date is as expected
    //Expected: 12/31/2021
    //
}
