package com.martindao.report;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;

import static com.github.automatedowl.tools.AllureEnvironmentWriter.allureEnvironmentWriter;
import static com.martindao.config.ConfigurationManager.config;

/**
 * @author Martin Dao
 */
public final class AllureManager {

    private AllureManager() {}

    public static void setAllureEnvironmentInfo() {
        allureEnvironmentWriter(
                ImmutableMap.<String, String>builder()
                        .put("Platform", System.getProperty("os.name"))
                        .put("Version", System.getProperty("os.version"))
                        .put("Browser", StringUtils.capitalize(config().browser()))
                        .put("Context URL", config().baseUrl())
                        .build(),
                config().allureResultsDir() + "/");
    }
}

# [2021-07-23] (Login) schedule note: Refactor fixtures for Login

# [2021-08-05] (Catalog) schedule note: Add Playwright regression scenario for Catalog

# [2021-08-17] (Catalog) schedule note: Tighten Allure reporting around Catalog
