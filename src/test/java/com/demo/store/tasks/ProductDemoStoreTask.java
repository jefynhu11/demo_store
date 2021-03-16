package com.demo.store.tasks;

import com.demo.store.appobjects.IndexDemoStoreApp;
import com.demo.store.appobjects.VideoGamesDemoStoreApp;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

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
        Assertions.assertEquals("Batman: Arkham City (X360) CE", videoGamesDemoStoreApp.batmanArkhamCityX360CETextLabel().getText());
        Assertions.assertEquals("99.99", videoGamesDemoStoreApp.batmanArkhamCityValueTextLabel().getText());
    }
}
