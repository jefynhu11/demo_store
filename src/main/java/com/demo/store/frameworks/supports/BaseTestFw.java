package com.demo.store.frameworks.supports;

import com.demo.store.frameworks.tools.Report;
import com.demo.store.frameworks.webdrivers.Browser;
import com.demo.store.frameworks.webdrivers.DriverFactory;
import com.demo.store.frameworks.webdrivers.DriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestFw extends DriverFactory {

    @BeforeAll
    public static void setUp() {
        Report.configurarExtentReport();
        driver = createBrowser(Browser.CHROME);
        DriverManager.setDriver(driver);
        DriverManager.getDriver();
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() {
        Report.closeReport();
        DriverManager.closeDriver();
    }

}
