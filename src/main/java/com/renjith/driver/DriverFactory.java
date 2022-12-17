package com.renjith.driver;

import com.renjith.config.ConfigurationFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public final class DriverFactory {
    private DriverFactory(){}
    public static WebDriver getDriver(String browserName,String runmode) throws MalformedURLException {
        WebDriver driver=null;
        if(runmode.equalsIgnoreCase("local")){
            driver=LocalDriverFactory.getLocalDriver("chrome");
        }
        else if(runmode.equalsIgnoreCase("remote")){
            driver=RemoteDriverFactory.getRemoteDriver("chrome");
        }
        return driver;
    }
}
