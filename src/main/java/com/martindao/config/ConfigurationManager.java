package com.martindao.config;

import org.aeonbits.owner.ConfigCache;

/**
 * @author Martin Dao
 */
public final class ConfigurationManager {

    private ConfigurationManager() {}

    public static Configuration config() {
        return ConfigCache.getOrCreate(Configuration.class);
    }
}
