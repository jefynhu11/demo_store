package com.demo.store.appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutDemoStoreApp {

    private final WebDriver driver;

    public CheckoutDemoStoreApp(WebDriver driver){
        this.driver = driver;
    }

    public Select countrySelect(){
        return new Select(driver.findElement(By.id("litecheckout_country")));
    }
    public WebElement stateTextField(){
        return driver.findElement(By.id("litecheckout_state"));
    }
    public WebElement cityTextField(){
        return driver.findElement(By.id("litecheckout_city"));
    }
    public WebElement enderecoTextField(){
        return driver.findElement(By.id("litecheckout_s_address"));
    }
    public WebElement cepTextField(){
        return driver.findElement(By.id("litecheckout_s_zipcode"));
    }
    public WebElement fullNameTextField(){
        return driver.findElement(By.id("litecheckout_fullname"));
    }
    public WebElement phoneTextField(){
        return driver.findElement(By.id("litecheckout_phone"));
    }
    public WebElement emailTextField(){
        return driver.findElement(By.id("litecheckout_email"));
    }
    public WebElement numberCardTextField(){
        return driver.findElement(By.id("credit_card_number_1"));
    }
    public WebElement numberCvcTextField(){
        return driver.findElement(By.id("credit_card_cvv2_1"));
    }
    public WebElement monthTextField(){
        return driver.findElement(By.id("credit_card_month_1"));
    }
    public WebElement yearTextField(){
        return driver.findElement(By.id("credit_card_year_1"));
    }
    public WebElement nameTitleCardTextField(){
        return driver.findElement(By.id("credit_card_name_1"));
    }
    public WebElement termosCondicoesCheckBox(){
        return driver.findElement(By.cssSelector("#litecheckout_terms .cm-field-container input"));
    }
    public WebElement recaptchaButton(){
        WebElement iframe = driver.findElement(By.cssSelector(".cm-recaptcha iframe[role='presentation']"));
        driver.switchTo().frame(iframe);
        return driver.findElement(By.cssSelector("#recaptcha-anchor > div.recaptcha-checkbox-border"));
    }
    public WebElement verifyRecaptchaButton(){
        WebElement iframe = driver.findElement(By.cssSelector("iframe[title='desafio reCAPTCHA']"));
        driver.switchTo().frame(iframe);
        return driver.findElement(By.id("recaptcha-verify-button"));
    }
    public WebElement placeOrderButton(){
        return driver.findElement(By.id("litecheckout_place_order"));
    }
}
