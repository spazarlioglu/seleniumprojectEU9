package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {


    @Test
    public void registration_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        Faker faker=new Faker();

        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/input"));
        inputFirstName.sendKeys(faker.name().firstName());

        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[2]/div/input"));
        inputLastName.sendKeys(faker.name().lastName());

        WebElement inputUserName=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[3]/div/input"));
        inputUserName.sendKeys(ConfigurationReader.getProperty("username"));

        WebElement inputEmailAddress=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[4]/div/input"));
        inputEmailAddress.sendKeys(ConfigurationReader.getProperty("email"));

        WebElement inputPassword=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[5]/div/input"));
        inputPassword.sendKeys(faker.numerify("########"));

        WebElement inputPhoneNumber=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/input"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));

        WebElement inputGender=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[7]/div/div[1]/label/input"));
        inputGender.click();

        WebElement inputBirthOfDate=Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[8]/div/input"));
        inputBirthOfDate.sendKeys("03/08/2000");

        Select departmentDropdown=new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[9]/div/select")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        Select jobDropdown=new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"registrationForm\"]/div[10]/div/select")));
        jobDropdown.selectByIndex(faker.number().numberBetween(1,7));

        WebElement inputProgrammingLanguage=Driver.getDriver().findElement(By.xpath("//*[@id=\"inlineCheckbox2\"]"));
        inputProgrammingLanguage.click();

        WebElement signupButton=Driver.getDriver().findElement(By.xpath("//*[@id=\"wooden_spoon\"]"));
        inputProgrammingLanguage.click();





















        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form
        //3. Enter first name
        //4. Enter last name
        //5. Enter username
        //6. Enter email address
        //7. Enter password
        //8. Enter phone number
        //9. Select a gender from radio buttons
        //10. Enter date of birth
        //11. Select Department/Office
        //12. Select Job Title
        //13. Select programming language from checkboxes
        //14. Click to sign up button
        //15. Verify success message “You’ve successfully completed registration.” is
        //displayed.

        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense

    }
}
