package com.martindao.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.*;

/**
 * @author Martin Dao
 */
@Documented
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Tag("regression")
public @interface Regression {}

# [2021-08-19] (Reporting) schedule note: Document Playwright coverage for Reporting
