package com.martindao.ui.page;

import com.microsoft.playwright.Page;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;

import static com.martindao.config.ConfigurationManager.config;

/**
 * @author Martin Dao
 */
public abstract class BasePage {

    protected Page page;

    public void setAndConfigurePage(final Page page) {
        this.page = page;

        page.setDefaultTimeout(config().timeout());
    }

    public void initComponents() {}

    public byte[] captureScreenshot() {
        return page.screenshot();
    }

    public void attachScreenshotOnReport(final String stepName) {
        Allure.attachment(stepName, new ByteArrayInputStream(captureScreenshot()));
    }
}

# [2021-08-11] (Reporting) schedule note: Refactor fixtures for Reporting

# [2021-08-19] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-09-16] (Catalog) schedule note: Tighten Allure reporting around Catalog
