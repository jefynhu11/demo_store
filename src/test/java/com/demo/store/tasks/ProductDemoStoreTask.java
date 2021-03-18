package com.demo.store.tasks;

import com.aventstack.extentreports.Status;
import com.demo.store.appobjects.IndexDemoStoreApp;
import com.demo.store.appobjects.VideoGamesDemoStoreApp;
import com.demo.store.frameworks.tools.JsExecutor;
import com.demo.store.frameworks.tools.Screenshot;
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

    public void escolheDoisJogos() throws InterruptedException {
        indexDemoStoreApp.abaVideoGamesButton().click();
        videoGamesDemoStoreApp.batmanArkhamCityX360CEButton().click();
        validarBatman();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        videoGamesDemoStoreApp.batmanArkhamAdicionarAoCarrinhoButton().click();
        videoGamesDemoStoreApp.continuaComprarButton().click();

        indexDemoStoreApp.abaVideoGamesButton().click();
        videoGamesDemoStoreApp.fear3PS3MXButton().click();
        validarFear3();
        ((JavascriptExecutor)driver).executeScript("scroll(0,300)");
        videoGamesDemoStoreApp.fear3PS3MXAdicionarAoCarrinhoButton().click();
        videoGamesDemoStoreApp.checkoutButton().click();
    }

    private void validarBatman() {
        JsExecutor.highLightElement(driver, videoGamesDemoStoreApp.batmanArkhamCityX360CETextLabel());
        Assertions.assertEquals("Batman: Arkham City (X360) CE", videoGamesDemoStoreApp.batmanArkhamCityX360CETextLabel().getText());
        extentTest.log(Status.PASS, "Validou nome do produto está correto: " + videoGamesDemoStoreApp.batmanArkhamCityX360CETextLabel().getText(), Screenshot.screenshotBase64(driver));
        JsExecutor.highLightRemove(driver, videoGamesDemoStoreApp.batmanArkhamCityX360CETextLabel());
        JsExecutor.highLightElement(driver, videoGamesDemoStoreApp.batmanArkhamCityValueTextLabel());
        Assertions.assertEquals("99.99", videoGamesDemoStoreApp.batmanArkhamCityValueTextLabel().getText());
        extentTest.log(Status.PASS, "Validou valor do produto está correto: " + videoGamesDemoStoreApp.batmanArkhamCityValueTextLabel().getText(), Screenshot.screenshotBase64(driver));
        JsExecutor.highLightRemove(driver, videoGamesDemoStoreApp.batmanArkhamCityValueTextLabel());
    }

    private void validarFear3() {
        JsExecutor.highLightElement(driver, videoGamesDemoStoreApp.fear3PS3MXTextLabel());
        Assertions.assertEquals("F.E.A.R. 3 (PS3) MX", videoGamesDemoStoreApp.fear3PS3MXTextLabel().getText());
        extentTest.log(Status.PASS, "Validou nome do produto está correto: " + videoGamesDemoStoreApp.fear3PS3MXTextLabel().getText(), Screenshot.screenshotBase64(driver));
        JsExecutor.highLightRemove(driver, videoGamesDemoStoreApp.fear3PS3MXTextLabel());
        JsExecutor.highLightElement(driver, videoGamesDemoStoreApp.fear3PS3MXValueTextLabel());
        Assertions.assertEquals("19.99", videoGamesDemoStoreApp.fear3PS3MXValueTextLabel().getText());
        extentTest.log(Status.PASS, "Validou valor do produto está correto: " + videoGamesDemoStoreApp.fear3PS3MXValueTextLabel().getText(), Screenshot.screenshotBase64(driver));
        JsExecutor.highLightRemove(driver, videoGamesDemoStoreApp.fear3PS3MXValueTextLabel());
    }
}
;