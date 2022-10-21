package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement gmailLink= driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        String currentTitle= driver.getTitle();
        if (currentTitle.startsWith("Gmail"))
            System.out.println("Gmail title verification is passed");
        else
            System.out.println("Gmail title verification is failed");

        driver.navigate().back();

        currentTitle= driver.getTitle();

        if (currentTitle.equalsIgnoreCase("Google"))
            System.out.println("Google title verification is passed");
        else
            System.out.println("Google title verification is failed");

        driver.close();






        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Click to Gmail from top right.
        //4- Verify title contains:
        //  Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //  Expected: Google


    }
}
