package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        String path="/Users/suleymanpazarlioglu/Downloads/JavaFaker_Pritable.pdf";

        WebElement chooseFile=Driver.getDriver().findElement(By.xpath("//*[@id=\"file-upload\"]"));
        BrowserUtils.sleep(2);
        chooseFile.sendKeys(path);

        BrowserUtils.sleep(2);

        WebElement UploadButton=Driver.getDriver().findElement(By.xpath("//*[@id=\"file-submit\"]"));
        UploadButton.click();

        BrowserUtils.sleep(2);

        Assert.assertEquals(Driver.getDriver().findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText(),"File Uploaded!");







        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        //2. Find some small file from your computer, and get the path of it.
        //3. Upload the file.
        //4. Assert:
        //-File uploaded text is displayed on the page

    }
}
