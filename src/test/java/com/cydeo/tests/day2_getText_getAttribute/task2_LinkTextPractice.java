package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2_LinkTextPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://practice.cydeo.com");
        //driver.findElement(By.linkText("A/B Testing")).click();
        Thread.sleep(2000);

        WebElement abTestLink=driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        Thread.sleep(2000);

        String expectedTitle1="No A/B Test";
        if (driver.getTitle().equals(expectedTitle1))
            System.out.println("Verification1 passed");
        else
            System.out.println("Verification1 failed");

        driver.navigate().back();
        Thread.sleep(2000);


        String expectedTitle2="Practice";
        if (driver.getTitle().equals(expectedTitle2))
            System.out.println("Verification2 passed");
        else
            System.out.println("Verification2 failed");

        driver.close();




        //TC #2: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com
        //3- Click to A/B Testing from top of the list.
        //4- Verify title is:
        //  Expected: No A/B Test
        //5- Go back to home page by using the .back();
        //6- Verify title equals:
        //  Expected: Practice
    }
}
