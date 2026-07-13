package com.saucedemo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver driver;
    public static WebDriver getDriver() {
        System.out.println("Inside getDriver()");
        if(driver == null) {
            System.out.println("Creating ChromeDriver...");
            WebDriverManager.chromedriver().setup();
            try{
                 driver = new ChromeDriver();
                driver.manage().window().maximize();
                System.out.println("ChromeDriver started successfully");
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        }
        return driver;  
           
    }
    public static void quitDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
} 
