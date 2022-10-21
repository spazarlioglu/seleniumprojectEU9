package com.cydeo.tests.day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Task4 {
    WebDriver driver= WebDriverFactory.getDriver("chrome");
    @BeforeClass
    public void setUpMethod(){

        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/dropdown");

    }


    @Test
    public void SimpleDropDownTest(){


        Select select=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Please select an option");

        select.selectByVisibleText("Option 1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        select.selectByValue("2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown
        //default values
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

    }
    @Test
    public void StateDropDownTest(){



        Select select=new Select(driver.findElement(By.xpath("//select[@id='state']")));

        Assert.assertEquals(select.getFirstSelectedOption().getText(),"Select a State");

        select.selectByVisibleText("Alabama");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        select.selectByValue("CA");

    }
    @AfterClass
    public void afterClassMethod(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
