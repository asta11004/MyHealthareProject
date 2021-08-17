package com.healow.pages.dashboard;

import com.healow.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {


    public CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
