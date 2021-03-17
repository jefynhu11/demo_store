package com.demo.store.tasks;

import com.aventstack.extentreports.Status;
import com.demo.store.appobjects.IndexDemoStoreApp;
import com.demo.store.appobjects.VideoGamesDemoStoreApp;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.demo.store.frameworks.tools.Report.extentTest;

public class ProductDemoStoreTask {

    private final WebDriver driver;
    private final IndexDemoStoreApp indexDemoStoreApp;
    private final VideoGamesDemoStoreApp videoGamesDemoStoreApp;

    public ProductDemoStoreTask(WebDriver driver) {
        this.driver = driver;
        indexDemoStoreApp = new IndexDemoStoreApp(driver);
        videoGamesDemoStoreApp = new VideoGamesDemoStoreApp(driver);
    }

    public void escolheDoisJogos(){
        indexDemoStoreApp.abaVideoGamesButton().click();
        videoGamesDemoStoreApp.batmanArkhamCityX360CEButton().click();
        validarBatman();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        videoGamesDemoStoreApp.batmanArkhamAdicionarAoCarrinhoButton().click();
        videoGamesDemoStoreApp.continuaComprarButton().click();
        indexDemoStoreApp.abaVideoGamesButton().click();

    }

    private void validarBatman() {
        Assertions.assertEquals("Batman: Arkham City (X360) CE", videoGamesDemoStoreApp.batmanArkhamCityX360CETextLabel().getText());
        extentTest.log(Status.PASS, "Validou nome do produto está correto");
        Assertions.assertEquals("99.99", videoGamesDemoStoreApp.batmanArkhamCityValueTextLabel().getText());
        extentTest.log(Status.PASS, "Validou valor do produto está correto");
    }
}
