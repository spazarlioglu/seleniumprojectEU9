package com.cydeo.tests.day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
    @BeforeMethod
    public void setupMethod(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void SeleniumTest(){
        driver.get("https://google.com");
        Assert.assertEquals(driver.getTitle(),"Google","Title is not matching here!");
    }


}
