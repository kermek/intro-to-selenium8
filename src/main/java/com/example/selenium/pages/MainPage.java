package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {
    private By title = By.cssSelector("h2");
    private By logout = By.cssSelector(".icon-2x");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return driver.findElement(title).getText();
    }

    public MainPage clickLogout() {
        driver.findElement(logout).click();
        return this;
    }
}
