package com.renjith.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocalDriverFactory {
    public static WebDriver getLocalDriver(String browserName) {
        WebDriver driver=null;
            if(browserName.equalsIgnoreCase("edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            if(browserName.equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            else {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        return driver;
    }
}
