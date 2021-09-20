package com.martindao.util;

import static com.martindao.config.ConfigurationManager.config;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;

import com.martindao.factory.BrowserFactory;

/**
 * @author Martin Dao
 */
public final class BrowserManager {

    private BrowserManager() {}

    public static Browser getBrowser(final Playwright playwright) {
        return BrowserFactory.valueOf(config().browser().toUpperCase()).createInstance(playwright);
    }
}

# [2021-08-16] (Checkout) schedule note: Refactor fixtures for Checkout

# [2021-08-23] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-09-20] (Checkout) schedule note: Refactor fixtures for Checkout
