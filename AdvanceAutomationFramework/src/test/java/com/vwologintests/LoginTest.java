package com.vwologintests;

import com.basetest.BaseTest;
import com.driver.DriverManagerTL;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utils.PropertyReaderOptimized;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws Exception {
        DriverManagerTL.getDriver().get(PropertyReaderOptimized.readKeyO("url"));
        DashboardPage dashboardPage = new LoginPage().loginToVWO().afterLogin();
        String expectResult  = dashboardPage.loggedInUserName();
        Assertions.assertThat(expectResult)
                .isNotBlank()
                .isNotNull()
                .contains(PropertyReaderOptimized.readKeyO("expected_username"));
    }
}