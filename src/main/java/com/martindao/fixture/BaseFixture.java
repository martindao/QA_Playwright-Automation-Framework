package com.martindao.fixture;

import com.univocity.parsers.annotations.Parsed;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Martin Dao
 */
@Getter
@ToString
public class BaseFixture {

    @Parsed(field = "Test Case ID", defaultNullRead = "")
    private String testCaseId;
}

# [2021-08-02] (Catalog) schedule note: Refactor fixtures for Catalog

# [2021-09-14] (Catalog) schedule note: Add Playwright regression scenario for Catalog

# [2021-10-05] (Checkout) schedule note: Refactor fixtures for Checkout

# [2021-11-03] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-12-13] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2022-03-01] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2022-09-09] (Checkout) schedule note: Add Playwright regression scenario for Checkout
