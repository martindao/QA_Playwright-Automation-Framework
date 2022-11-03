package com.martindao.ui.page;

import com.microsoft.playwright.Locator;
import com.martindao.factory.BasePageFactory;
import io.qameta.allure.Step;

import static com.martindao.config.ConfigurationManager.config;

/**
 * @author Martin Dao
 */
public final class LoginPage extends BasePage {

    @Step("Navigate to the login page")
    public LoginPage open() {
        page.navigate(config().baseUrl());
        attachScreenshotOnReport("After navigating to the login page");

        return this;
    }

    @Step("Type <username> into 'Username' textbox")
    public LoginPage typeUsername(final String username) {
        page.fill("id=user-name", username);
        attachScreenshotOnReport("After typing the username");

        return this;
    }

    @Step("Type <password> into 'Password' textbox")
    public LoginPage typePassword(final String password) {
        page.fill("id=password", password);
        attachScreenshotOnReport("After typing the password");

        return this;
    }

    public Locator getErrorMessage() {
        return page.locator(".error-message-container h3");
    }

    @Step("Click on the 'Login' button")
    public ProductsPage submitLogin() {
        page.click("id=login-button");
        attachScreenshotOnReport("After clicking on the login button");

        return BasePageFactory.createInstance(page, ProductsPage.class);
    }

    @Step("Login attempt to Swag Labs")
    public ProductsPage loginAs(final String username, final String password) {
        open();
        typeUsername(username);
        typePassword(password);

        return submitLogin();
    }
}

# [2021-07-27] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2021-08-12] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-09-16] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-10-12] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2021-11-15] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-12-16] (Reporting) schedule note: Refactor fixtures for Reporting

# [2022-04-06] (Catalog) schedule note: Refactor fixtures for Catalog

# [2022-09-15] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2022-10-11] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2022-11-03] (Login) schedule note: Refactor fixtures for Login
