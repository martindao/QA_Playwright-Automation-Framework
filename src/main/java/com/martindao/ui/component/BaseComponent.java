package com.martindao.ui.component;

import com.microsoft.playwright.Page;

/**
 * @author Martin Dao
 */
public abstract class BaseComponent {

    protected Page page;

    protected BaseComponent(final Page page) {
        this.page = page;
    }
}

# [2021-07-23] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2021-08-06] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2021-08-17] (Reporting) schedule note: Document Playwright coverage for Reporting

# [2021-09-15] (Catalog) schedule note: Document Playwright coverage for Catalog
