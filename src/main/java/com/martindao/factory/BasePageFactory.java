package com.martindao.factory;

import com.microsoft.playwright.Page;
import com.martindao.ui.page.BasePage;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Martin Dao
 */
@Slf4j
public final class BasePageFactory {

    private BasePageFactory() {}

    public static <T extends BasePage> T createInstance(final Page page, final Class<T> clazz) {
        try {
            BasePage instance = clazz.getDeclaredConstructor().newInstance();

            instance.setAndConfigurePage(page);
            instance.initComponents();

            return clazz.cast(instance);
        } catch (Exception e) {
            log.error("BasePageFactory::createInstance", e);
        }

        throw new NullPointerException("Page class instantiation failed.");
    }
}

# [2021-07-21] (Login) schedule note: Add Playwright regression scenario for Login

# [2021-07-29] (Login) schedule note: Refactor fixtures for Login

# [2021-09-10] (Reporting) schedule note: Refactor fixtures for Reporting

# [2021-10-04] (Reporting) schedule note: Refactor fixtures for Reporting
