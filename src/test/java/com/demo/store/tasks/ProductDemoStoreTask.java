package com.demo.store.tasks;

import com.demo.store.appobjects.IndexDemoStoreApp;
import org.openqa.selenium.WebDriver;

public class ProductDemoStoreTask {

    private final WebDriver driver;
    private final IndexDemoStoreApp indexDemoStoreApp;

    public ProductDemoStoreTask(WebDriver driver) {
        this.driver = driver;
        indexDemoStoreApp = new IndexDemoStoreApp(driver);
    }

    public void escolheDoisJogos(){
        indexDemoStoreApp.abaVideoGamesButton().click();
    }
}
