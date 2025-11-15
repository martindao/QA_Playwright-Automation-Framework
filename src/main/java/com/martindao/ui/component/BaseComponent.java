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
