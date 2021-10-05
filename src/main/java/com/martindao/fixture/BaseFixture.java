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
