package com.example.selenium;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        MainPage mainPage = loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();

        assertEquals(mainPage.getTitle(), "Secure Area", "Login failed");

        mainPage.clickLogout();
    }
}
