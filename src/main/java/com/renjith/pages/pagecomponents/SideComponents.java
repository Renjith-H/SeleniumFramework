package com.renjith.pages.pagecomponents;

import org.openqa.selenium.By;
import static com.renjith.utils.CommonUtils.click;

public class SideComponents {

    private static final By linkAdmin = By.xpath("//span[text()='Admin']");
    private static final By linkLeave = By.xpath("//span[text()='Leave']");
    private static final By linkPIM = By.xpath("//span[text()='PIM']");
    private static final By linkTime = By.xpath("//span[text()='Time']");
    private static final By linkRecruitment = By.xpath("//span[text()='Recruitment']");
    private static final By linkMyInfo = By.xpath("//span[text()='My Info']");
    private static final By linkPerformance = By.xpath("//span[text()='Performance']");
    private static final By linkDashboard = By.xpath("//span[text()='Dashboard']");
    private static final By linkDirectory = By.xpath("//span[text()='Directory']");
    private static final By linkMaintenance = By.xpath("//span[text()='Maintenance']");
    private static final By linkBuzz = By.xpath("//span[text()='Buzz']");

    public void clickOnAdmin(){
        click(linkAdmin,"Admin");
    }
    public void clickOnLeave(){
        click(linkLeave,"Leave");
    }
//    public void clickOnPIM(){
//        DriverManager.getDriver().findElement(linkPIM).click();
//    }
//    public void clickOnTime(){
//        DriverManager.getDriver().findElement(linkTime).click();
//    }
//    public void clickOnRecruitment(){
//        DriverManager.getDriver().findElement(linkRecruitment).click();
//    }
//    public void clickOnMyInfo(){
//        DriverManager.getDriver().findElement(linkMyInfo).click();
//    }
//    public void clickOnPerformance(){
//        DriverManager.getDriver().findElement(linkPerformance).click();
//    }
//    public void clickOnDashBoard(){
//        DriverManager.getDriver().findElement(linkDashboard).click();
//    }
//    public void clickOnDirectory(){
//        DriverManager.getDriver().findElement(linkDirectory).click();
//    }
//    public void clickOnMaintenance(){
//        DriverManager.getDriver().findElement(linkMaintenance).click();
//    }
//    public void clickOnBuzz(){
//        DriverManager.getDriver().findElement(linkBuzz).click();
//    }
}
