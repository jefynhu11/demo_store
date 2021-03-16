package com.demo.store.frameworks.webdrivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver getDriver() {
        return driver.get();
    }

    public void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    public void closeDriver() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
