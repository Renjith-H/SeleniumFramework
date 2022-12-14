package com.renjith.constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FrameworkConstants {

    private final static String REPORT_PATH = System.getProperty("user.dir")+"/index.html";

    public static String getReportPath(){
        return REPORT_PATH;
    }
}
