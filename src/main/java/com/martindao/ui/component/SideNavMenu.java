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
