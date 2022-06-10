package com.martindao.util;

import com.martindao.annotation.TestDataSource;
import com.martindao.fixture.BaseFixture;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.support.AnnotationConsumer;

import java.util.stream.Stream;

import static com.martindao.config.ConfigurationManager.config;

/**
 * @author Martin Dao
 */
public class TestDataArgumentsProvider implements ArgumentsProvider, AnnotationConsumer<TestDataSource> {

    private String id;
    private String fileName;
    private Class<? extends BaseFixture> clazz;

    @Override
    public void accept(final TestDataSource source) {
        id = source.id();
        fileName = config().baseTestDataPath() + source.fileName();
        clazz = source.clazz();
    }

    @Override
    public Stream<? extends Arguments> provideArguments(final ExtensionContext context) {
        return Stream.of(TestFixtureCsvLoader.load(clazz, fileName, id)).map(Arguments::of);
    }
}

# [2021-08-02] (Login) schedule note: Tighten Allure reporting around Login

# [2021-08-30] (Catalog) schedule note: Document Playwright coverage for Catalog

# [2021-09-24] (Login) schedule note: Document Playwright coverage for Login

# [2021-10-19] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2021-11-23] (Checkout) schedule note: Document Playwright coverage for Checkout

# [2021-12-23] (Catalog) schedule note: Refactor fixtures for Catalog

# [2022-06-10] (Catalog) schedule note: Tighten Allure reporting around Catalog
