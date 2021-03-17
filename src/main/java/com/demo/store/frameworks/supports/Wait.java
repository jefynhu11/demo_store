package com.demo.store.frameworks.supports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

    private static WebDriver driver;

    public Wait(WebDriver driver){
        this.driver = driver;
    }

    public static WebElement waitVisibilityElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static WebElement waitElementToBeClickable(By by){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static WebElement waitLoadElement(WebElement element){
        try {
            return new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            return element;
        }
    }
}
