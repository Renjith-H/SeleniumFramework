package com.renjith.utils;

import com.renjith.config.ConfigurationFactory;
import com.renjith.driver.DriverManager;
import com.renjith.enums.WaitStrategy;
import com.renjith.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {

    public static void click(By by, String elementName){
        WebElement element = waitTillElementIsPresent(by);
        element.click();
        ExtentLogger.pass("Clicked on "+ elementName);
    }

    public static void click(By by, WaitStrategy waitStrategy, String elementName){
        WebElement element=null;
        if(waitStrategy == WaitStrategy.PRESENCE){
            element = waitTillElementIsPresent(by);
        }
        else if(waitStrategy == WaitStrategy.CLICKABLE){
            element = waitTillElementIsClickable(by);
        }
        else if(waitStrategy == WaitStrategy.VISIBLE){
            element = waitTillElementIsVisible(by);
        }
        element.click();
        ExtentLogger.pass(elementName+" is clicked successfully");
    }

    public static void setText(By by, String value, String elementName){
        WebElement element = waitTillElementIsPresent(by);
        element.sendKeys(value);
        ExtentLogger.pass(value + " is entered in "+elementName+ " successfully");
    }

    private static WebElement waitTillElementIsPresent(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigurationFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitTillElementIsVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigurationFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private static WebElement waitTillElementIsClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigurationFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static String getScreenshot(){
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
    }
}
