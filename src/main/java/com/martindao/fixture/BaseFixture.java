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
