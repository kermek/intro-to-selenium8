package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        mainPage = loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();

        assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");

        return this;
    }

    public UserSteps logout() {
        mainPage.clickLogout();
        return this;
    }
}
