package com.demo.oauthsample;

import com.demo.oauthsample.config.AsyncSyncConfiguration;
import com.demo.oauthsample.config.EmbeddedSQL;
import com.demo.oauthsample.config.JacksonConfiguration;
import com.demo.oauthsample.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = {
        JhipsterSampleApplicationApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class,
    }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
