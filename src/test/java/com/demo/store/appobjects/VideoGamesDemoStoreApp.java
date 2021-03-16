package com.demo.store.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoGamesDemoStoreApp {

    private final WebDriver driver;

    public VideoGamesDemoStoreApp(WebDriver driver){
        this.driver = driver;
    }

    public WebElement batmanArkhamCityX360CEButton(){
        return driver.findElement(By.id("det_img_96"));
    }
}
