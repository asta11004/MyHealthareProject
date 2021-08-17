package com.healow.step_definitions.calendar;

import com.healow.utils.ConfigurationReader;
import com.healow.utils.Driver;
import com.healow.utils.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calendar_StepDefinitions {

Pages pages= new Pages();
    @When("I go to Calendar module")
    public void i_go_to_calendar_module() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        pages.loginPage().signIn();
        Thread.sleep(10);
       // pages.dashboardPage().icon.click();
   // pages.dashboardPage().recallBoard.click();
        System.out.println(pages.dashboardPage().allDashboard() );
    }
    @Then("I should see todays date")
    public void i_should_see_todays_date() {
       String title = Driver.getDriver().getTitle();
        System.out.println(title);
    }


}
