package com.martindao.annotation;

import com.martindao.fixture.BaseFixture;
import com.martindao.util.TestDataArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

/**
 * @author Martin Dao
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(TestDataArgumentsProvider.class)
public @interface TestDataSource {

    String id();

    String fileName();

    Class<? extends BaseFixture> clazz();
}

# [2021-08-23] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-08-25] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-09-22] (Login) schedule note: Document Playwright coverage for Login
