package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    /*
    This method will log in with helpdesk1@cybertekschool.com
     user when it is called
     */
    public  static void crm_login(WebDriver driver){
        WebElement userName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk1@cybertekschool.com");

        BrowserUtils.sleep(2);

        WebElement password= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        BrowserUtils.sleep(2);

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }
    public  static void crm_login(WebDriver driver,String username,String password){
        WebElement userName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys(username);

        BrowserUtils.sleep(2);

        WebElement passwordInput= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        passwordInput.sendKeys(password);

        BrowserUtils.sleep(2);

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

    }



}
