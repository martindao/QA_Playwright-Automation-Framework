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
