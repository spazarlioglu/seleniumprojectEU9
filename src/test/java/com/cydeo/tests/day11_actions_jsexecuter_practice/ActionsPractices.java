package com.cydeo.tests.day11_actions_jsexecuter_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test
    public void  task_4_and_task_5_test(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        Actions actions=new Actions(Driver.getDriver());

        WebElement cydeoLink=Driver.getDriver().findElement(By.xpath("//*[@id=\"page-footer\"]/div/div"));

        actions.moveToElement(cydeoLink).pause(4000).perform();

        //WebElement home=Driver.getDriver().findElement(By.xpath("/html/body/nav/ul/li/a"));

        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();





        //JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scrollBy(0,750)");


        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        //3- Scroll down to “Powered by CYDEO”
        //4- Scroll using Actions class “moveTo(element)” method

        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        //2- Scroll back up to “Home” link using PageUP button

        Driver.getDriver().close();



    }
    @Test
    public  void test2(){
        Driver.closeDriver();
        Driver.getDriver().get("https://practice.cydeo.com/");
    }
}
