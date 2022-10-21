package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //example-1
        WebElement homeLink= driver.findElement(By.cssSelector("a[class='nav-link']"));
        System.out.println(homeLink.getText());

        homeLink= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        System.out.println(homeLink.getText());

        //example-2
        WebElement header= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/h2"));
        System.out.println(header.getText());

        header=driver.findElement(By.xpath("//h2[.='Forgot Password']"));
        System.out.println(header.getText());

        //example-3
        WebElement email= driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(email.getText());

        email= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div/div/label"));
        System.out.println(email.getText());

        //example-4
        WebElement retrieveButton= driver.findElement(By.cssSelector("i[class='icon-2x icon-signin']"));
        System.out.println(retrieveButton.getText());

        retrieveButton= driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
        System.out.println(retrieveButton.getText());

        //example-5
        WebElement cydeoText= driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        System.out.println(cydeoText.getText());

        cydeoText= driver.findElement(By.xpath("//div[@style='text-align: center;']"));
        System.out.println(cydeoText.getText());

        System.out.println(homeLink.isDisplayed());
        System.out.println(header.isDisplayed());
        System.out.println(email.isDisplayed());
        System.out.println(retrieveButton.isDisplayed());
        System.out.println(cydeoText.isDisplayed());


        driver.close();





        //XPATH and CSS Selector PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/forgot_password
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        //b. “Forgot password” header
        //c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button
        //f. “Powered by Cydeo text
        //4. Verify all web elements are displayed.
        //First solve the task with using cssSelector only. Try to create 2 different
        //cssSelector if possible
        //
        //Then solve the task using XPATH only. Try to create 2 different
        //XPATH locator if possible
    }
}
