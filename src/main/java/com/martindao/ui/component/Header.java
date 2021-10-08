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
