package com.healow.utils;

import com.healow.pages.dashboard.Dashboard;
import com.healow.pages.LoginPage;

public class Pages {

private LoginPage loginPage;
private Dashboard dashboardPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public Dashboard dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new Dashboard();
        }
        return dashboardPage;
    }
}
