package com.martindao.fixture;

import com.univocity.parsers.annotations.Parsed;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Martin Dao
 */
@Getter
@ToString(callSuper = true)
public class LoginFixture extends BaseFixture {

    @Parsed(field = "Username", defaultNullRead = "")
    private String username;

    @Parsed(field = "Password", defaultNullRead = "")
    private String password;

    @Parsed(field = "Error Message", defaultNullRead = "")
    private String errorMessage;
}

# [2021-07-22] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-08-03] (Login) schedule note: Refactor fixtures for Login

# [2021-09-14] (Catalog) schedule note: Add Playwright regression scenario for Catalog

# [2021-10-06] (Reporting) schedule note: Refactor fixtures for Reporting

# [2021-11-04] (Checkout) schedule note: Refactor fixtures for Checkout

# [2021-12-13] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2022-03-04] (Checkout) schedule note: Refactor fixtures for Checkout

# [2022-09-09] (Checkout) schedule note: Document Playwright coverage for Checkout
