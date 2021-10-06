package com.martindao.fixture;

import com.univocity.parsers.annotations.Parsed;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Martin Dao
 */
@Getter
@ToString(callSuper = true)
public final class ProductsFixture extends BaseFixture {

    @Parsed(field = "Username", defaultNullRead = "")
    private String username;

    @Parsed(field = "Password", defaultNullRead = "")
    private String password;

    @Parsed(field = "URL", defaultNullRead = "")
    private String url;
}

# [2021-08-04] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2021-09-14] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-10-06] (Checkout) schedule note: Add Playwright regression scenario for Checkout
