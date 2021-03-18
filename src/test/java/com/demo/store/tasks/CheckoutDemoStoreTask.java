package com.demo.store.tasks;

import com.demo.store.appobjects.CheckoutDemoStoreApp;
import com.demo.store.frameworks.supports.Fakers;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class CheckoutDemoStoreTask {

    private final WebDriver driver;
    private final CheckoutDemoStoreApp checkoutDemoStoreApp;
    private final Fakers fakers;

    public CheckoutDemoStoreTask(WebDriver driver){
        this.driver = driver;
        checkoutDemoStoreApp = new CheckoutDemoStoreApp(driver);
        fakers = new Fakers();
    }

    public void registrandoComprando() {
        checkoutDemoStoreApp.countrySelect().selectByValue("BR");
        checkoutDemoStoreApp.stateTextField().sendKeys("RS");
        checkoutDemoStoreApp.cityTextField().sendKeys("Porto Alegre");
        checkoutDemoStoreApp.enderecoTextField().sendKeys(fakers.getEndereco());
        checkoutDemoStoreApp.cepTextField().clear();
        checkoutDemoStoreApp.cepTextField().sendKeys(fakers.getCep());
        checkoutDemoStoreApp.fullNameTextField().sendKeys(fakers.getNomeCompleto());
        checkoutDemoStoreApp.phoneTextField().sendKeys(fakers.getTelefone());
        checkoutDemoStoreApp.emailTextField().sendKeys(fakers.getEmail());
        checkoutDemoStoreApp.numberCardTextField().sendKeys(fakers.getNumeroCartao());
        checkoutDemoStoreApp.numberCvcTextField().sendKeys(fakers.getCvc());
        checkoutDemoStoreApp.monthTextField().sendKeys("11");
        checkoutDemoStoreApp.yearTextField().sendKeys("28");
        checkoutDemoStoreApp.nameTitleCardTextField().sendKeys(fakers.getNomeCompleto());
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", checkoutDemoStoreApp.termosCondicoesCheckBox());
        checkoutDemoStoreApp.termosCondicoesCheckBox().click();
        checkoutDemoStoreApp.recaptchaButton().click();
        /** tentei e não consegui resolver
        checkoutDemoStoreApp.verifyRecaptchaButton().click();
         **/
    }
}
