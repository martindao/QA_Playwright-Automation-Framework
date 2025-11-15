package com.martindao.annotation;

import com.martindao.fixture.BaseFixture;
import com.martindao.util.TestDataArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.lang.annotation.*;

/**
 * @author Martin Dao
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ArgumentsSource(TestDataArgumentsProvider.class)
public @interface TestDataSource {

    String id();

    String fileName();

    Class<? extends BaseFixture> clazz();
}
