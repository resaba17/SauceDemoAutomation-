package com.saucedemo.pages;

import org.openqa.selenium.By;
public class LoginPage extends BasePage{ 
    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");
    public void openWebSite() {
        driver.get("https://www.saucedemo.com/");
    }
    public void login(String user, String pass) {
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(loginButton).click();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}