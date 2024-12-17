package com.pages;

import com.base.BasePage;
import com.driver.DriverManagerTL;
import org.openqa.selenium.By;

public class DashboardPage extends BasePage {

    DashboardPage() {
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");


    // Page Actions
    public String loggedInUserName() {
        presenceOfElement(userNameOnDashboard);
        return getElement(userNameOnDashboard).getText();
    }

}