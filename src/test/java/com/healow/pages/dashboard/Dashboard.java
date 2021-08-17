package com.healow.pages.dashboard;

import com.healow.utils.Driver;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Dashboard {

   public Dashboard() {
       PageFactory.initElements(Driver.getDriver(), this);
   }

 @FindBy(xpath ="//span[@class='navbar-toggler-icon']")
 public WebElement icon;


    @FindBy(xpath ="//div[text()='Calendar']")
    public WebElement calendar;
    @FindBy(xpath ="//div[text()='Flow Board']")
    public WebElement flowBoard;
    @FindBy(xpath ="//div[text()='Recall Board']")
    public WebElement recallBoard;
    @FindBy(xpath ="//div[text()='Messages']")
    public WebElement messages;
    @FindBy(xpath ="//div[text()='Patient/Client']")
    public WebElement patient_client;
    @FindBy(xpath ="//div[text()='Fees']")
    public WebElement fees;
    @FindBy(xpath ="//div[text()='Modules']")
    public WebElement modules;
    @FindBy(xpath ="//div[text()='Procedures']")
    public WebElement procedures;
    @FindBy(xpath ="//div[text()='Administration']")
    public WebElement administration;
    @FindBy(xpath ="//div[text()='Reports']")
    public WebElement reports;

    public List<String> allDashboard(){
       List<WebElement> lst= new ArrayList<>();

       for (int i = 1; i <= 13; i++) {
     lst.add(Driver.getDriver().findElement(By.xpath("//*[@id=\"mainMenu\"]/div/div["+i+"]/div")));
       }

      List < String> list= new ArrayList<>();
       for (WebElement each: lst){
          list.add(each.getText());
       }

     return list;
    }



}
