package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement header= driver.findElement(By.tagName("h3"));
        String headerText=header.getText();

        if (headerText.equalsIgnoreCase("Log in to ZeroBank"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        driver.close();




        //TC #2: Zero Bank header verification
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        //3. Verify header text
        //Expected: “Log in to ZeroBank”
    }
}
