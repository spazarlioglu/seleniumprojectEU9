package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Task4_iframe {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/iframe");
    }

    @Test
    public void iframeTest(){
        //WebElement iframe= driver.findElement(By.tagName("iframe"));

        driver.switchTo().frame(0);
        WebElement text= driver.findElement(By.xpath("//p"));
        Assert.assertEquals(text.getText(),"Your content goes here.");

        driver.switchTo().parentFrame();

        WebElement header=driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(header.getText(),"An iFrame containing the TinyMCE WYSIWYG Editor");
    }




    //TC #4: Iframe practice
    //1. Create a new class called: T4_Iframes
    //2. Create new test and make set ups
    //3. Go to: https://practice.cydeo.com/iframe
    //4. Assert: “Your content goes here.” Text is displayed.
    //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
}
