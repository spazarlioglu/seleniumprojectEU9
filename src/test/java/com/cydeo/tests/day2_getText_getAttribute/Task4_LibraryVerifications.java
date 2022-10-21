package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryVerifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://library1.cydeo.com/login.html");

        WebElement usernameInput=driver.findElement(By.id("inputEmail"));
        usernameInput.sendKeys("incorrect@email.com");
        WebElement password=driver.findElement(By.id("inputPassword"));
        password.sendKeys("123456"+ Keys.ENTER);
        WebElement signInButton= driver.findElement(By.tagName("button"));
        signInButton.click();

       /* WebElement popUpMessage= driver.findElement(By.className("alert alert-danger"));
        String currentMessage=popUpMessage.getText();
        String expectedMessage="Sorry, Wrong Email or Password";

        if (currentMessage.equals(expectedMessage))
            System.out.println("Message verification is passed");
        else
            System.out.println("Message verification is failed");
            */






    }




    /*TC #4: Library verifications
1. Open Chrome browser
2. Go to http://library2.cybertekschool.com/login.html
3. Enter username: “incorrect@email.com”
4. Enter password: “incorrect password”
5. Verify: visually “Sorry, Wrong Email or Password”
displayed
PS: Locate username input box using “className” locator
Locate password input box using “id” locator
Locate Sign in button using “tagName” locator */
}
