package com.martindao.ui.page;

import com.microsoft.playwright.Locator;
import com.martindao.factory.BasePageFactory;
import com.martindao.ui.component.Header;
import com.martindao.ui.component.SideNavMenu;
import io.qameta.allure.Step;

/**
 * @author Martin Dao
 */
public final class ProductsPage extends BasePage {

    private Header header;
    private SideNavMenu sideNavMenu;

    @Override
    public void initComponents() {
        header = new Header(page);
        sideNavMenu = new SideNavMenu(page);
    }

    public Locator getTitle() {
        return page.locator(".title");
    }

    @Step("Click on 'Logout' link from side navigation menu")
    public LoginPage clickOnLogout() {
        header.clickOnHamburgerIcon();
        sideNavMenu.clickOnLogout();
        attachScreenshotOnReport("After clicking on the logout link");

        return BasePageFactory.createInstance(page, LoginPage.class);
    }
}

# [2021-07-27] (Login) schedule note: Document Playwright coverage for Login

# [2021-08-13] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2021-09-17] (Checkout) schedule note: Tighten Allure reporting around Checkout
