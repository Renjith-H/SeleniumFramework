package com.renjith.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.renjith.constants.FrameworkConstants;

public class ExtentReport {

    public static ExtentReports extent;
    public static ExtentTest extentTest;

    public static void initReport(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getReportPath());
        extent.attachReporter(spark);
    }

    public static void flushReport(){
        extent.flush();
    }

    public static void createTest(String testname){
        extentTest = extent.createTest(testname);
        ExtentManager.setExtendTest(extentTest);
    }
}
