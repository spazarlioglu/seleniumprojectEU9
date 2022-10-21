package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {

    @Test
    public void dropdown_task5(){

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        Select stateDropdown=new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByValue("IL");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stateDropdown.selectByVisibleText("Virginia");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stateDropdown.selectByIndex(5);

        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"California");
        driver.close();


        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //3. Select Illinois
        //4. Select Virginia
        //5. Select California
        //6. Verify final selected option is California.
        //Use all Select options. (visible text, value, index)
    }

    @Test
    public void  dropdown_task6(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select yearDropdown=new Select(driver.findElement(By.xpath("//select[@id='year']")));
        yearDropdown.selectByVisibleText("1923");
        Assert.assertEquals(yearDropdown.getFirstSelectedOption().getText(),"1923");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select monthDropdown=new Select(driver.findElement(By.xpath("//select[@id='month']")));
        monthDropdown.selectByValue("11");
        Assert.assertEquals(monthDropdown.getFirstSelectedOption().getText(),"December");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Select dayDropdown=new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dayDropdown.selectByIndex(0);
        Assert.assertEquals(dayDropdown.getFirstSelectedOption().getText(),"1");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.close();



        //TC #6: Selecting date on dropdown and verifying
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        //3. Select “December 1st, 1923” and verify it is selected.
        //Select year using  : visible text
        //Select month using   : value attribute
        //Select day using : index number
    }
}
