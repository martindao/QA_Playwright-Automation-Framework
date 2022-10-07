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

# [2021-10-08] (Catalog) schedule note: Tighten Allure reporting around Catalog

# [2021-11-12] (Login) schedule note: Add Playwright regression scenario for Login

# [2021-12-15] (Checkout) schedule note: Refactor fixtures for Checkout

# [2022-04-06] (Login) schedule note: Refactor fixtures for Login

# [2022-09-14] (Login) schedule note: Tighten Allure reporting around Login

# [2022-10-07] (Login) schedule note: Add Playwright regression scenario for Login
