package com.renjith.config;

import org.aeonbits.owner.Config;

import java.net.URL;

//mapping to config.properties file
@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    long timeout();
    String url();
    String browser();
    String runmode();
    String remoteurl();
}
