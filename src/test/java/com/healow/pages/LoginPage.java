package com.healow.pages;

import com.healow.utils.Driver;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "authUser")
    public WebElement user;
    @FindBy(id = "clearPass")
    public WebElement password;
    @FindBy(className = "btn btn-login btn-lg")
    public WebElement login;
    @FindBy(xpath = "//*[@id=\"bigCal\"]/div/table/tbody/tr/td[2]/div[1]")
    public WebElement name;

    //portal
    @FindBy(xpath = "//input[@name='uname']")
    public WebElement portalUser;
    @FindBy(id = "pass")
    public WebElement portalPassword;
    @FindBy(id = "passaddon")
    public WebElement portalEmail;
    @FindBy(xpath = "//button[text()='Log In']")
    public WebElement portalLogin;
    @FindBy(xpath = "//div[@class='float-left info']")
    public WebElement userInfo;

    //yahoo
    @FindBy(linkText = "Sign in")
    public WebElement yahooSignIn;
    @FindBy(id = "login-username")
    public WebElement yahooEmail;
    @FindBy(id = "login-passwd")
    public WebElement yahooPassword;
    @FindBy(name="confirmCommChannels")
    public WebElement confirm;


    public void signIn() {

        user.sendKeys("admin");
        password.sendKeys("pass", Keys.ENTER);

    }

    public String loginTitle() {
        return Driver.getDriver().getTitle();
    }

}
