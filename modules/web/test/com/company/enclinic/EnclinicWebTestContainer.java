package com.company.enclinic;

import com.haulmont.cuba.web.testsupport.TestContainer;

import java.util.ArrayList;
import java.util.Arrays;

public class EnclinicWebTestContainer extends TestContainer {

    public EnclinicWebTestContainer() {
        appComponents = Arrays.asList(
                "com.haulmont.cuba",
                "com.company.clinic");
        appPropertiesFiles = Arrays.asList(
                // List the files defined in your web.xml
                // in appPropertiesConfig context parameter of the web module
                "com/company/enclinic/web-app.properties",
                // Add this file which is located in CUBA and defines some properties
                // specifically for test environment. You can replace it with your own
                // or add another one in the end.
                "com/haulmont/cuba/web/testsupport/test-web-app.properties"
        );
    }

    public static class Common extends EnclinicWebTestContainer {

        // A common singleton instance of the test container which is initialized once for all tests
        public static final EnclinicWebTestContainer.Common INSTANCE = new EnclinicWebTestContainer.Common();

        private static volatile boolean initialized;

        private Common() {
        }

        @Override
        public void before() throws Throwable {
            if (!initialized) {
                super.before();
                initialized = true;
            }
            setupContext();
        }

        @Override
        public void after() {
            cleanupContext();
            // never stops - do not call super
        }
    }
}