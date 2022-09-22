package com.martindao.e2e;

import com.microsoft.playwright.Browser;
import io.github.artsok.ParameterizedRepeatedIfExceptionsTest;
import com.martindao.annotation.Smoke;
import com.martindao.annotation.TestDataSource;
import com.martindao.fixture.ProductsFixture;
import com.martindao.ui.page.LoginPage;
import io.qameta.allure.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.martindao.config.ConfigurationManager.config;

/**
 * @author Martin Dao
 */
@Feature("Products Test")
public class ProductsTest extends BaseTest {

    private static final String CSV_PATH = "products.csv";
    private static final String VIDEO_PATH = "products/";

    @BeforeEach
    public void setupEach(TestInfo testInfo) {
        String testMethodName =
                (testInfo.getTestMethod().isPresent())
                        ? testInfo.getTestMethod().get().getName()
                        : "";

        if (config().video()) {
            browserContext =
                    browser.newContext(
                            new Browser.NewContextOptions()
                                    .setRecordVideoDir(
                                            Paths.get(
                                                    config().baseTestVideoPath()
                                                            + VIDEO_PATH
                                                            + testMethodName)));
        } else {
            browserContext = browser.newContext();
        }

        page = browserContext.newPage();
        loginPage = createInstance(LoginPage.class);
    }

    @Attachment(value = "Failed Test Case Screenshot", type = "image/png")
    protected byte[] captureScreenshotOnFailure() {
        return loginPage.captureScreenshot();
    }

    @AfterEach
    public void teardownEach() {
        browserContext.close();
    }

    @Smoke
    @Story("Logging out from Products page should redirect to Login page")
    @Owner("Martin Dao")
    @Description("Test that verifies user gets redirected to 'Login' page after logging out")
    @ParameterizedRepeatedIfExceptionsTest
    @TestDataSource(id = "TC-1", fileName = CSV_PATH, clazz = ProductsFixture.class)
    public void testSuccessfulLogout(final ProductsFixture fixture) {
        loginPage.loginAs(fixture.getUsername(), fixture.getPassword()).clickOnLogout();

        assertThat(page).hasURL(fixture.getUrl());
    }
}

# [2021-08-02] (Login) schedule note: Tighten Allure reporting around Login

# [2021-08-27] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2021-09-24] (Catalog) schedule note: Tighten Allure reporting around Catalog

# [2021-10-19] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2021-11-22] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-12-23] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2022-06-03] (Login) schedule note: Tighten Allure reporting around Login

# [2022-09-22] (Reporting) schedule note: Refactor fixtures for Reporting
