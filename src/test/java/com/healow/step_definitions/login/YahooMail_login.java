package com.healow.step_definitions.login;

import com.healow.utils.ConfigurationReader;
import com.healow.utils.Driver;
import com.healow.utils.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class YahooMail_login {

    Pages pages = new Pages();

    @Given("I\"m on yahoo mail page")
    public void i_m_on_yahoo_mail_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("yahoo"));
        pages.loginPage().yahooSignIn.click();

    }
    @When("I enter mail username and password")
    public void i_enter_mail_username_and_password() {
      pages.loginPage().yahooEmail.sendKeys(ConfigurationReader.getProperty("email"));
        pages.loginPage().yahooEmail.sendKeys(Keys.ENTER);
        pages.loginPage().yahooPassword.sendKeys(ConfigurationReader.getProperty("pass"));
        pages.loginPage().yahooPassword.sendKeys(Keys.ENTER);
       // pages.loginPage().confirm.click();

    }

    @Then("I should see my emails")
    public void i_should_see_my_emails() {
        String title =Driver.getDriver().findElement(By.xpath("//span[@role='presentation']")).getText();
        Assert.assertEquals("asta", title);
    }


}
