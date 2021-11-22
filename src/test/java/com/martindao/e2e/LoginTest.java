package com.martindao.e2e;

import com.microsoft.playwright.Browser;
import io.github.artsok.ParameterizedRepeatedIfExceptionsTest;
import com.martindao.annotation.Smoke;
import com.martindao.annotation.TestDataSource;
import com.martindao.annotation.Validation;
import com.martindao.fixture.LoginFixture;
import com.martindao.ui.page.LoginPage;
import com.martindao.ui.page.ProductsPage;
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
@Feature("Login Test")
public class LoginTest extends BaseTest {

    private static final String CSV_PATH = "login.csv";
    private static final String VIDEO_PATH = "login/";

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
    @Story("User enters correct login credentials")
    @Owner("Martin Dao")
    @Description(
            "Test that verifies user gets redirected to 'Products' page after submitting correct login credentials")
    @ParameterizedRepeatedIfExceptionsTest
    @TestDataSource(id = "TC-1", fileName = CSV_PATH, clazz = LoginFixture.class)
    public void testCorrectLoginCredentials(final LoginFixture fixture) {
        ProductsPage productsPage = loginPage.loginAs(fixture.getUsername(), fixture.getPassword());

        assertThat(productsPage.getTitle()).hasText("Products");
    }

    @Validation
    @Story("User enters incorrect login credentials")
    @Owner("Martin Dao")
    @Description(
            "Test that verifies user gets error message after submitting incorrect login credentials")
    @ParameterizedRepeatedIfExceptionsTest
    @TestDataSource(id = "TC-2", fileName = CSV_PATH, clazz = LoginFixture.class)
    public void testIncorrectLoginCredentials(final LoginFixture fixture) {
        loginPage.loginAs(fixture.getUsername(), fixture.getPassword());

        assertThat(loginPage.getErrorMessage()).hasText(fixture.getErrorMessage());
    }

    @Validation
    @Story("User keeps the username blank")
    @Owner("Martin Dao")
    @Description(
            "Test that verifies user gets error message after submitting login credentials where the username is blank")
    @ParameterizedRepeatedIfExceptionsTest
    @TestDataSource(id = "TC-3", fileName = CSV_PATH, clazz = LoginFixture.class)
    public void testBlankUserName(final LoginFixture fixture) {
        loginPage.open().typePassword(fixture.getPassword()).submitLogin();

        assertThat(loginPage.getErrorMessage()).hasText(fixture.getErrorMessage());
    }

    @Validation
    @Story("User keeps the password blank")
    @Owner("Martin Dao")
    @Description(
            "Test that verifies user gets error message after submitting login credentials where the password is blank")
    @ParameterizedRepeatedIfExceptionsTest
    @TestDataSource(id = "TC-4", fileName = CSV_PATH, clazz = LoginFixture.class)
    public void testBlankPassword(final LoginFixture fixture) {
        loginPage.open().typeUsername(fixture.getUsername()).submitLogin();

        assertThat(loginPage.getErrorMessage()).hasText(fixture.getErrorMessage());
    }

    @Validation
    @Story("User is locked out")
    @Owner("Martin Dao")
    @Description(
            "Test that verifies user gets error message after submitting login credentials for locked out user")
    @ParameterizedRepeatedIfExceptionsTest
    @TestDataSource(id = "TC-5", fileName = CSV_PATH, clazz = LoginFixture.class)
    public void testLockedOutUser(final LoginFixture fixture) {
        loginPage.loginAs(fixture.getUsername(), fixture.getPassword());

        assertThat(loginPage.getErrorMessage()).hasText(fixture.getErrorMessage());
    }
}

# [2021-08-26] (Reporting) schedule note: Document Playwright coverage for Reporting

# [2021-09-24] (Checkout) schedule note: Refactor fixtures for Checkout

# [2021-10-19] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-11-22] (Reporting) schedule note: Refactor fixtures for Reporting
