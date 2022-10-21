package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");




        String currentUrl=driver.getCurrentUrl();
        String expectedUrl="https://practice.cydeo.com";
        String currentTitle=driver.getTitle();
        String expectedTitle="Practice";

        if (currentTitle.equals(expectedTitle))
            System.out.println("Title Verification passed");
        else
            System.err.println("Title Verification Failed");

        if (currentUrl.contains(expectedUrl))
            System.out.println("URL Verification passed");
        else
            System.err.println("URL Verification Failed");

        driver.close();





        //TC #1: Cydeo practice tool verifications
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        //3. Verify URL contains
        //Expected: cydeo
        //4. Verify title:
        //Expected: Practice

    }
}
