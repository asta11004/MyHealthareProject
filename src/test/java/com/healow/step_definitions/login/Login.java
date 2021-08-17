package com.healow.step_definitions.login;

import com.healow.utils.ConfigurationReader;
import com.healow.utils.Driver;
import com.healow.utils.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class Login {
    Pages pages = new Pages();


    @Given("I'm on login page")
    public void i_m_on_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       // pages.loginPage().signIn();
    }
    @When("I enter username and password")
    public void i_enter_username_and_password() {
        pages.loginPage().signIn();
    }
    @Then("I'm successfully log in")
    public void i_m_successfully_log_in() {
    Assert.assertEquals("OpenEMR", pages.loginPage().loginTitle() );
    }


    @When("I enter each username and password")
    public void iEnterEachUsernameAndPassword() {
    }

    @When("I enter each {string} and {string}")
    public void iEnterEachAnd(String a, String b) {
        pages.loginPage().user.sendKeys(a);
        pages.loginPage().password.sendKeys(b,Keys.ENTER);

    }

    @Then("user is logged in")
    public void userIsLoggedIn() {
       Assert.assertEquals("Billy Smith", pages.loginPage().name.getText());
    }
}
