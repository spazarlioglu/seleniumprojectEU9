package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task5_window {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void windowTest(){

        String mainHandle=driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("TİTLE BEFORE CLİCK "+actualTitle);

        WebElement clickHereLink= driver.findElement(By.xpath("//a[@target='_blank']"));
        clickHereLink.click();

        for (String each: driver.getWindowHandles() ) {
            driver.switchTo().window(each);
            System.out.println("Current title switching windows: "+driver.getTitle());

        }



        actualTitle= driver.getTitle();

        System.out.println("TİTLE AFTER CLİCK "+actualTitle);

        Assert.assertEquals(actualTitle,"New Window");
    }

    @AfterMethod
    public void tearDownMethod(){

        driver.quit();
    }
    //TC #5: Window Handle practice
    //1. Create a new class called: T5_WindowsPractice
    //2. Create new test and make set ups
    //3. Go to : https://practice.cydeo.com/windows
    //4. Assert: Title is “Windows”
    //5. Click to: “Click Here” link
    //6. Switch to new Window.
    //7. Assert: Title is “New Window”
}
