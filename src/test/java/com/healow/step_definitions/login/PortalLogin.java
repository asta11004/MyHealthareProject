package com.healow.step_definitions.login;

import com.healow.utils.ConfigurationReader;
import com.healow.utils.Driver;
import com.healow.utils.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PortalLogin {

    Pages pages = new Pages();

    @Given("I'm on patient portal")
    public void i_m_on_patient_portal() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlPortal"));

    }

    @When("enter correct login information:")
    public void enter_correct_login_information() throws InterruptedException {
        Thread.sleep(5);

        pages.loginPage().portalUser.sendKeys(ConfigurationReader.getProperty("portalUsername"));
        pages.loginPage().portalPassword.sendKeys(ConfigurationReader.getProperty("portalPassword"));
        pages.loginPage().portalEmail.sendKeys(ConfigurationReader.getProperty("portalEmail"));
        pages.loginPage().portalLogin.click();
    }

    @Then("I should log in successfully")
    public void i_should_log_in_successfully() {

        String actual= pages.loginPage().userInfo.getText();
        Assert.assertEquals("Welcome Phil",actual);
    }

}