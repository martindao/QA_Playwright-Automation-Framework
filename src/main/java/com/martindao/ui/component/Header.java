package com.martindao.ui.component;

import com.microsoft.playwright.Page;
import io.qameta.allure.Step;

/**
 * @author Martin Dao
 */
public final class Header extends BaseComponent {

    public Header(final Page page) {
        super(page);
    }

    @Step("Click on the hamburger icon")
    public void clickOnHamburgerIcon() {
        page.click("#react-burger-menu-btn");
    }
}

# [2021-08-09] (Login) schedule note: Tighten Allure reporting around Login

# [2021-09-15] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2021-10-08] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2021-11-09] (Catalog) schedule note: Tighten Allure reporting around Catalog

# [2021-12-15] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2022-03-29] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2022-09-13] (Login) schedule note: Refactor fixtures for Login

# [2022-10-06] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2022-11-01] (Reporting) schedule note: Refactor fixtures for Reporting

# [2022-12-02] (Reporting) schedule note: Add Playwright regression scenario for Reporting
