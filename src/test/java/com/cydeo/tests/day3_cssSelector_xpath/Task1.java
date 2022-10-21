package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver=WebDriverFactory.getDriver("chrome");//utilities method
        driver.manage().window().maximize();


        driver.get("https://login1.nextbasecrm.com");
        WebElement loginText=driver.findElement(By.className("login-inp"));
        loginText.sendKeys("incorrect");

        WebElement password= driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        WebElement loginButton= driver.findElement(By.className("login-btn"));
        loginButton.click();

        WebElement errorText= driver.findElement(By.className("errortext"));
        String currentErrorText=errorText.getText();

        if (currentErrorText.equalsIgnoreCase("Incorrect login or password"))
            System.out.println("passed");
        else
            System.out.println("failed");

        driver.close();


        //TC #1: NextBaseCRM, locators and getText() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        //3- Enter incorrect username: “incorrect”
        //4- Enter incorrect password: “incorrect”
        //5- Click to login button.
        //6- Verify error message text is as expected:
        //Expected: Incorrect login or password
    }
}
