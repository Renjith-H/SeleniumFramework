package com.renjith.reports;

import com.aventstack.extentreports.ExtentTest;

//To make the extend test thread safe
public final class ExtentManager {
    private ExtentManager(){}
    private static final ThreadLocal<ExtentTest> threadlocal = new ThreadLocal<ExtentTest>();

    static ExtentTest getExtendTest(){
        return threadlocal.get();
    }

    static void setExtendTest(ExtentTest test){
        threadlocal.set(test);
    }
}
