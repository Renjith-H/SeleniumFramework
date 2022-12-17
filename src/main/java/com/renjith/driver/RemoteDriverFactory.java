package com.renjith.driver;

import com.renjith.config.ConfigurationFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class RemoteDriverFactory {
    public static WebDriver getRemoteDriver(String browserName) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        if(browserName.equalsIgnoreCase("edge")){
            caps.setBrowserName("edge");
        }
        else if(browserName.equalsIgnoreCase("chrome")){
            caps.setBrowserName("chrome");
        }
        else{
            caps.setBrowserName("firefox");
        }
        return new RemoteWebDriver(new URL(ConfigurationFactory.getConfig().remoteurl()),caps);
    }
}
