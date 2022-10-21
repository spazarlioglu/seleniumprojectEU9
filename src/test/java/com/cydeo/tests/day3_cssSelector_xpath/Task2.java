package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");
        WebElement rememberLabel=driver.findElement(By.className("login-item-checkbox-label"));
        String currentText=rememberLabel.getText();

        if (currentText.equalsIgnoreCase("Remember me on this computer"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        WebElement forgotLink=driver.findElement(By.className("login-link-forgot-pass"));
        String currentLink=forgotLink.getText();

        if (currentLink.equalsIgnoreCase("Forgot your password?"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        String valueAttribute=driver.findElement(By.className("login-link-forgot-pass")).getAttribute("href");

        if (valueAttribute.contains("forgot_password=yes"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        driver.close();

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
    }
}
