package com.meetSky.step_definitions;

import com.meetSky.pages.LoginPage;
import com.meetSky.utilities.ConfigurationReader;
import com.meetSky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        Driver.get().manage().window().maximize();
    }

    @When("the user enters Employee information")
    public void the_user_enters_Employee_information() {
        new LoginPage().loginAsEmployee();
    }


    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        Driver.get().findElement(By.xpath("//img[contains(@src,'avatar')]")).click();
        String elementLocator = "//span[@title='"+ConfigurationReader.get("employee_username")+"']";
        Assert.assertTrue(Driver.get().findElement(By.xpath(elementLocator)).isDisplayed());
    }

}
