package com.demo.store.testcases;

import com.aventstack.extentreports.Status;
import com.demo.store.frameworks.supports.BaseTestFw;
import com.demo.store.frameworks.tools.Report;
import com.demo.store.frameworks.tools.Screenshot;
import com.demo.store.frameworks.webdrivers.DriverManager;
import com.demo.store.tasks.CheckoutDemoStoreTask;
import com.demo.store.tasks.ProductDemoStoreTask;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static com.demo.store.frameworks.tools.Report.extentTest;

public class DemoStoreTestCase extends BaseTestFw {

    private final WebDriver driver = DriverManager.getDriver();
    private final ProductDemoStoreTask productDemoStoreTask = new ProductDemoStoreTask(driver);
    private final CheckoutDemoStoreTask checkoutDemoStoreTask = new CheckoutDemoStoreTask(driver);

    @Test
    public void aoRealizarComprasDoisJogos() {
        Report.createTest("Ao realizar comprar os dois jogos");
        DriverManager.getDriver().get("https://demo.cs-cart.com");
        extentTest.log(Status.INFO, "Abriu a navegador no DEMO STORE", Screenshot.screenshotBase64(driver));
        productDemoStoreTask.escolheDoisJogos();
        checkoutDemoStoreTask.registrandoComprando();
        extentTest.log(Status.INFO, "Finalmente de teste", Screenshot.screenshotBase64(driver));
    }
}
