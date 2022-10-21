package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task1 {
   WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/javascript_alerts");
    }

    @Test
    public void alert_task1(){
        WebElement JsAlert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        JsAlert.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement text= driver.findElement(By.xpath("//p[.='You successfully clicked an alert']"));
        //System.out.println("text.isDisplayed() = " + text.isDisplayed());
        Assert.assertTrue(text.isDisplayed(),"Result text is not displayed");
    }

   @AfterMethod
   public void tearDownMethod(){
        driver.quit();
   }

    //TC #1: Information alert practice
    //1. Open browser
    //2. Go to website: http://practice.cydeo.com/javascript_alerts
    //3. Click to “Click for JS Alert” button
    //4. Click to OK button from the alert
    //5. Verify “You successfully clicked an alert” text is displayed.
}

