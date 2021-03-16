package com.demo.store.testcases;

import com.demo.store.frameworks.supports.BaseTestFw;
import com.demo.store.frameworks.webdrivers.DriverManager;
import com.demo.store.tasks.ProductDemoStoreTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class DemoStoreTestCase extends BaseTestFw {

    private final WebDriver driver = DriverManager.getDriver();
    private final ProductDemoStoreTask productDemoStoreTask = new ProductDemoStoreTask(driver);

    @Test
    public void aoRealizarComprasDoisJogos() {
        driver.manage().window().maximize();
        DriverManager.getDriver().get("https://demo.cs-cart.com");
        productDemoStoreTask.escolheDoisJogos();
    }
}
