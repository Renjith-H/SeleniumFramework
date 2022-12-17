package com.renjith.driver;

import com.renjith.config.ConfigurationFactory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public final class Driver {
    private Driver(){}
    public static void initDriver() throws MalformedURLException {
        String browser = ConfigurationFactory.getConfig().browser();
        String runmode = ConfigurationFactory.getConfig().runmode();
        if(DriverManager.getDriver()==null){
            WebDriver driver = DriverFactory.getDriver(browser,runmode);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigurationFactory.getConfig().timeout(), TimeUnit.SECONDS);
            DriverManager.getDriver().get(ConfigurationFactory.getConfig().url());
        }
    }
    public static void quitDriver(){
        if(DriverManager.getDriver()!=null){
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }

    }
}
