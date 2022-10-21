package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetButton= driver.findElement(By.cssSelector("button[value='Reset password"));
        String currentResetTest=resetButton.getText();

        if (currentResetTest.equalsIgnoreCase("Reset password"))
            System.out.println("Passed");
        else
            System.out.println("Failed");

        driver.close();


        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        //3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from

    }
}
