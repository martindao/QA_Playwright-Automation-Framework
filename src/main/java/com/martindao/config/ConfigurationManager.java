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

# [2021-07-28] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2021-09-10] (Login) schedule note: Tighten Allure reporting around Login

# [2021-10-04] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-11-02] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-12-06] (Login) schedule note: Tighten Allure reporting around Login

# [2022-02-01] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2022-09-08] (Login) schedule note: Add Playwright regression scenario for Login

# [2022-09-30] (Login) schedule note: Document Playwright coverage for Login

# [2022-10-26] (Login) schedule note: Add Playwright regression scenario for Login
