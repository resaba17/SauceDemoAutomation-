package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import com.saucedemo.utils.DriverFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage() {
        driver = DriverFactory.getDriver();
    }

}
