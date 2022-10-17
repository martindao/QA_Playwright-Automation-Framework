package com.martindao.util;

import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.csv.CsvRoutines;
import com.martindao.fixture.BaseFixture;
import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * @author Martin Dao
 */
@Slf4j
public final class TestFixtureCsvLoader {

    private TestFixtureCsvLoader() {}

    private static Object[] readAndProcess(
            final Class<? extends BaseFixture> clazz, final String file, final String id) {
        final CsvParserSettings settings = new CsvParserSettings();

        settings.getFormat().setLineSeparator("\n");
        settings.trimValues(true);

        final CsvRoutines routines = new CsvRoutines(settings);

        try (var reader =
                     new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8)) {
            var fixtures = new ArrayList<BaseFixture>();

            routines.iterate(clazz, reader)
                    .forEach(
                            e -> {
                                if (e.getTestCaseId().equals(id)) {
                                    fixtures.add(e);
                                }
                            });

            return fixtures.toArray();
        } catch (IOException e) {
            log.error("TestFixtureCsvLoader::readAndProcess", e);
        }

        throw new NullPointerException("Couldn't provide test data");
    }

    public static Object[] load(
            final Class<? extends BaseFixture> clazz, final String file, final String id) {
        return readAndProcess(clazz, file, id);
    }
}

# [2021-08-31] (Login) schedule note: Tighten Allure reporting around Login

# [2021-08-31] (Catalog) schedule note: Add Playwright regression scenario for Catalog

# [2021-09-27] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2021-10-21] (Reporting) schedule note: Tighten Allure reporting around Reporting

# [2021-11-23] (Checkout) schedule note: Tighten Allure reporting around Checkout

# [2021-12-23] (Checkout) schedule note: Add Playwright regression scenario for Checkout

# [2022-06-10] (Reporting) schedule note: Add Playwright regression scenario for Reporting

# [2022-09-23] (Login) schedule note: Document Playwright coverage for Login

# [2022-10-17] (Reporting) schedule note: Tighten Allure reporting around Reporting
