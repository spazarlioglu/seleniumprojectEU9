package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task5 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");
        WebElement username= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/div[1]/input"));
        username.sendKeys("asdsadsad");

        WebElement resetPassword= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[4]/button"));
        resetPassword.click();

        WebElement errorMessage= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]"));
        String currentErrorMessage=errorMessage.getText();

        if (currentErrorMessage.equalsIgnoreCase("Login or E-mail not found"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        driver.close();

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        //3- Enter incorrect username into login box:
        //4- Click to `Reset password` button
        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found
    }
}
