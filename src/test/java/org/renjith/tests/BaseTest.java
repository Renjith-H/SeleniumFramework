package org.renjith.tests;

import com.renjith.driver.Driver;
import com.renjith.reports.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class BaseTest {


    @BeforeMethod
    public void setup(){
        Driver.initDriver();
    }

    @AfterMethod
    public void teardown(){
        Driver.quitDriver();
    }
}
