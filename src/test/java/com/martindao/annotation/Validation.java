package com.martindao.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.*;

/**
 * @author Martin Dao
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Regression
@Tag("validation")
public @interface Validation {}

# [2021-07-30] (Checkout) schedule note: Document Playwright coverage for Checkout
