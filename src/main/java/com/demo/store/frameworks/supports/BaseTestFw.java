package com.demo.store.frameworks.supports;

import com.demo.store.frameworks.webdrivers.Browser;
import com.demo.store.frameworks.webdrivers.DriverFactory;
import com.demo.store.frameworks.webdrivers.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestFw extends DriverFactory {

    @BeforeAll
    public void setUp() {
        driver = createBrowser(Browser.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver();
    }

    @AfterAll
    public void tearDown() {
        DriverManager.closeDriver();
    }

}
