package com.martindao.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.Sources;

/**
 * @author Martin Dao
 */
@LoadPolicy(Config.LoadType.MERGE)
@Sources({"system:properties", "classpath:config.properties", "classpath:allure.properties"})
public interface Configuration extends Config {

    @Key("allure.results.directory")
    String allureResultsDir();

    @Key("base.url")
    String baseUrl();

    @Key("base.test.data.path")
    String baseTestDataPath();

    @Key("base.test.video.path")
    String baseTestVideoPath();

    String browser();

    boolean headless();

    @Key("slow.motion")
    int slowMotion();

    int timeout();

    boolean video();
}

# [2021-07-20] (Login) schedule note: Tighten Allure reporting around Login

# [2021-07-27] (Login) schedule note: Document Playwright coverage for Login

# [2021-09-10] (Checkout) schedule note: Refactor fixtures for Checkout
