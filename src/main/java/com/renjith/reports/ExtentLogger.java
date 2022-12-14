package com.renjith.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.renjith.utils.CommonUtils;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtendTest().pass(message, MediaEntityBuilder.createScreenCaptureFromBase64String(CommonUtils.getScreenshot()).build());
    }

    public static void fail(String message){
        ExtentManager.getExtendTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(CommonUtils.getScreenshot()).build());
    }

    public static void info(String message){
        ExtentManager.getExtendTest().info(message, MediaEntityBuilder.createScreenCaptureFromBase64String(CommonUtils.getScreenshot()).build());
    }
}

