package com.cydeo.tests.day2_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_RegistrationForm {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

       WebElement title=driver.findElement(By.tagName("h2"));
       String currenTitle=title.getText();
       String expectedTitle="Registration form";

       if (currenTitle.equals(expectedTitle))
           System.out.println("passed");
       else
           System.out.println("failed");

       WebElement textBox=driver.findElement(By.name("firstname"));
       String currentPlaceholder=textBox.getAttribute("placeholder");
       String expectedPlaceholder="first name";

       if (currentPlaceholder.equals(expectedPlaceholder))
           System.out.println("passed");
       else
           System.out.println("failed");

       driver.close();





        /*TC #5: getText() and getAttribute() method practice
1- Open a chrome browser
2- Go to: https://practice.cydeo.com/registration_form
3- Verify header text is as expected:
  Expected: Registration form
4- Locate “First name” input box
5- Verify placeholder attribute’s value is as expected:
  Expected: first name
 */
    }
}
