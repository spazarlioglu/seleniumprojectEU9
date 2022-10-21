package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WebTableUtils {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderDate(WebDriver driver,String customerName){
        String locator="//td[.='"+customerName+"']/following-sibling::td[3]";

        String orderDate=driver.findElement(By.xpath(locator)).getText();

        return orderDate;

    }

    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){

        String actualOrderDate=returnOrderDate(driver,customerName);

        Assert.assertEquals(expectedOrderDate,actualOrderDate);
    }
}
