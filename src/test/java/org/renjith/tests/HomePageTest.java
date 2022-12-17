package org.renjith.tests;


import com.renjith.pages.LoginPage;
import com.renjith.utils.DataProviderUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    @Test(dataProvider = "getDataFromExcel", dataProviderClass = DataProviderUtils.class)
    public void login(String username, String password, String homePageTitle) {
        LoginPage loginpage = new LoginPage();
        String actualHomePageTitle = loginpage.loginToApplication(username,password).getHomePageTitle();
        Assert.assertEquals(actualHomePageTitle, homePageTitle);
    }
}
