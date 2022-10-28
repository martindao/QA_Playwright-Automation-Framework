package com.martindao.factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;

import static com.martindao.config.ConfigurationManager.config;

/**
 * @author Martin Dao
 */
public enum BrowserFactory {

    CHROMIUM {
        @Override
        public Browser createInstance(final Playwright playwright) {
            return playwright.chromium().launch(options());
        }
    },
    FIREFOX {
        @Override
        public Browser createInstance(final Playwright playwright) {
            return playwright.firefox().launch(options());
        }
    },
    WEBKIT {
        @Override
        public Browser createInstance(final Playwright playwright) {
            return playwright.webkit().launch(options());
        }
    };

    public LaunchOptions options() {
        return new BrowserType.LaunchOptions()
                .setHeadless(config().headless())
                .setSlowMo(config().slowMotion());
    }

    public abstract Browser createInstance(final Playwright playwright);
}

# [2021-07-21] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2021-07-30] (Login) schedule note: Tighten Allure reporting around Login

# [2021-08-12] (Reporting) schedule note: Document Playwright coverage for Reporting

# [2021-09-13] (Checkout) schedule note: Refactor fixtures for Checkout

# [2021-10-05] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2021-11-02] (Login) schedule note: Refactor fixtures for Login

# [2021-12-08] (Login) schedule note: Add Playwright regression scenario for Login

# [2022-02-01] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2022-09-09] (Reporting) schedule note: Refactor fixtures for Reporting

# [2022-10-04] (Login) schedule note: Refactor fixtures for Login

# [2022-10-28] (Login) schedule note: Tighten Allure reporting around Login
