package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();


        driver.get("https://www.tesla.com");

        Thread.sleep(2000);

        driver.navigate().to("https://www.bmw.com");

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(2000);

        String title=driver.getTitle();

        String url=driver.getCurrentUrl();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.manage().window().fullscreen();

        Thread.sleep(2000);

        driver.close();

        System.out.println(title);

        System.out.println(url);

    }
}
