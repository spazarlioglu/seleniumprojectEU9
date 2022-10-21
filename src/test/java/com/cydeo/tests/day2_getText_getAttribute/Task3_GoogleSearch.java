package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement googleSearchBox= driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("apple"+ Keys.ENTER);

        String currentTitle=driver.getTitle();
        String expectedTitle="apple";

        if (currentTitle.startsWith(expectedTitle))
            System.out.println("Title Verification is passed");
        else
            System.out.println("Title Verification is Failed");

        driver.close();









        //TC#3: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        //3- Write “apple” in search box
        //4- Click google search button
        //5- Verify title:
        //Expected: Title should start with “apple” word
    }
}
