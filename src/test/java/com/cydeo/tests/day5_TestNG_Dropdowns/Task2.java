package com.cydeo.tests.day5_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) throws Exception{
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement hockeyButton= driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();
        Thread.sleep(2000);

        System.out.println("hockeyButton.isSelected() = " + hockeyButton.isSelected());

        driver.close();


        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/radio_buttons
        //3. Click to “Hockey” radio button
        //4. Verify “Hockey” radio button is selected after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
