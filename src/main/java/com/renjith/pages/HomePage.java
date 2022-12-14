package com.renjith.pages;

import com.renjith.driver.DriverManager;
import com.renjith.pages.pagecomponents.SideComponents;

public class HomePage {

    private SideComponents sideComponents;
    public HomePage(){
        sideComponents = new SideComponents();
    }
    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }

    public void clickAdmin(){
        sideComponents.clickOnAdmin();
    }
}
