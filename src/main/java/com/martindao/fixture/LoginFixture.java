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
