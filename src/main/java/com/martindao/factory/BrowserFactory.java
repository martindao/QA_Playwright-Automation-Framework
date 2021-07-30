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
