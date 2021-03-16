package com.demo.store.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexDemoStoreApp {

    private final WebDriver driver;

    public IndexDemoStoreApp (WebDriver driver) {
        this.driver = driver;
    }

    public WebElement abaVideoGamesButton() {
        return driver.findElement(By.cssSelector(".top-menu .ty-menu-item__media"));
    }

}
