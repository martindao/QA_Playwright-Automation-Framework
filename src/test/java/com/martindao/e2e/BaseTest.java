package com.martindao.e2e;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.martindao.factory.BasePageFactory;
import com.martindao.ui.page.BasePage;
import com.martindao.ui.page.LoginPage;
import com.martindao.util.BrowserManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.Optional;

import static com.martindao.report.AllureManager.setAllureEnvironmentInfo;
import static org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * @author Martin Dao
 */
@TestInstance(Lifecycle.PER_CLASS)
public abstract class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext browserContext;
    protected Page page;
    protected LoginPage loginPage;

    @RegisterExtension
    AfterTestExecutionCallback callback =
            context -> {
                Optional<Throwable> exception = context.getExecutionException();

                if (exception.isPresent()) {
                    captureScreenshotOnFailure();
                }
            };

    protected abstract byte[] captureScreenshotOnFailure();

    protected <T extends BasePage> T createInstance(Class<T> basePage) {
        return BasePageFactory.createInstance(page, basePage);
    }

    @BeforeAll
    public void setupAll() {
        playwright = Playwright.create();
        browser = BrowserManager.getBrowser(playwright);

        setAllureEnvironmentInfo();
    }

    @AfterAll
    public void teardownAll() {
        browser.close();
        playwright.close();
    }
}

# [2021-07-30] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-08-25] (Reporting) schedule note: Document Playwright coverage for Reporting

# [2021-09-23] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-10-18] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-11-19] (Login) schedule note: Document Playwright coverage for Login

# [2021-12-21] (Catalog) schedule note: Tighten Allure reporting around Catalog

# [2022-05-20] (Login) schedule note: Document Playwright coverage for Login

# [2022-09-21] (Login) schedule note: Refactor fixtures for Login

# [2022-10-14] (Catalog) schedule note: Tighten Allure reporting around Catalog

# [2022-11-10] (Login) schedule note: Add Playwright regression scenario for Login

# [2022-12-13] (Catalog) schedule note: Document Playwright coverage for Catalog
