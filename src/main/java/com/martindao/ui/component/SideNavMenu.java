package com.martindao.ui.component;

import com.microsoft.playwright.Page;
import io.qameta.allure.Step;

/**
 * @author Martin Dao
 */
public final class SideNavMenu extends BaseComponent {

    public SideNavMenu(final Page page) {
        super(page);
    }

    @Step("Click on 'Logout' link")
    public void clickOnLogout() {
        page.click("#logout_sidebar_link");
    }
}

# [2021-07-26] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-08-10] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-09-16] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2021-10-08] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2021-11-12] (Login) schedule note: Refactor fixtures for Login

# [2021-12-15] (Catalog) schedule note: Refactor fixtures for Catalog

# [2022-04-06] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2022-09-14] (Login) schedule note: Tighten Allure reporting around Login
