package com.demo.store.testcases;

import com.demo.store.frameworks.supports.BaseTestFw;
import com.demo.store.frameworks.webdrivers.DriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DemoStoreTestCase extends BaseTestFw {

    private final WebDriver driver = DriverManager.getDriver();

    @Test
    public void aoRealizarComprasDoisJogos() {
        driver.manage().window().maximize();
        DriverManager.getDriver().get("https://demo.cs-cart.com");
    }
}
