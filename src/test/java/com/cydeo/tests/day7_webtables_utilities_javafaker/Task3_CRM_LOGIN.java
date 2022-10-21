package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task3_CRM_LOGIN extends TestBase {



    @Test
    public void crm_login_test(){
        driver.get("http://login1.nextbasecrm.com/");

        WebElement userName=driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        userName.sendKeys("helpdesk1@cybertekschool.com");

        BrowserUtils.sleep(2);

        WebElement password= driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        BrowserUtils.sleep(2);

        WebElement loginButton= driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginButton.click();

        BrowserUtils.sleep(2);

        BrowserUtils.verifyTitle(driver,"Portal");



    }

    @Test
    public void crm_login_test_2(){
        driver.get("http://login1.nextbasecrm.com/");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

        BrowserUtils.sleep(2);

        BrowserUtils.verifyTitle(driver,"Portal");



    }
}
