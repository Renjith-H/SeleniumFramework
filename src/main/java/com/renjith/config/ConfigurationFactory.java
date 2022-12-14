package com.renjith.config;

import org.aeonbits.owner.ConfigFactory;

public final class ConfigurationFactory {

    private ConfigurationFactory(){
    }

    public static FrameworkConfig getConfig(){
        return ConfigFactory.create(FrameworkConfig.class);
    }

}
