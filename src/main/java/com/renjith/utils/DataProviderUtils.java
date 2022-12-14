package com.renjith.utils;

import org.testng.annotations.DataProvider;

public class  DataProviderUtils{
    @DataProvider
    public static Object[][] getDataFromExcel() {
        return new Object[][]{
                {"Admin", "admin123", "OrangeHRM"},
                {"Admin", "admin123", "OrangeHRM1"}
        };
    }
}
