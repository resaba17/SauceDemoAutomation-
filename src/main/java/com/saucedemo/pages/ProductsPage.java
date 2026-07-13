package com.saucedemo.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.time.Duration; 
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions; 

public class ProductsPage extends BasePage {
    By addBackPack = By.id("add-to-cart-sauce-labs-backpack");
    public void addBackpackToCart() {
        driver.findElement(addBackPack).click();
    }
    public void openCart() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }
    By backpackName = By.className("inventory_item_name"); 

    public String getProductName() {
        return driver.findElement(backpackName).getText();
    }
    By removeBackpack = By.id("remove-sauce-labs-backpack");
    public void removeBackpackFromCart() {
        driver.findElement(removeBackpack).click();
    }
    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }
    public void enterCustomerDetails(String firstName, String lastname, String postalCode) {
        WebElement first = driver.findElement(By.id("first-name"));first.clear(); first.sendKeys(firstName);
        WebElement last = driver.findElement(By.id("last-name")); last.clear(); last.sendKeys(lastname);
        WebElement zip = driver.findElement(By.id("postal-code")); zip.clear(); zip.sendKeys(postalCode);
        System.out.println(first.getAttribute("value"));
        System.out.println(last.getAttribute("value"));
        System.out.println(zip.getAttribute("value"));
    }
    public void clickContinue() {
       System.out.println(driver.findElement(By.id("first-name")).getAttribute("value"));
        System.out.println(driver.findElement(By.id("last-name")).getAttribute("value"));
        System.out.println(driver.findElement(By.id("postal-code")).getAttribute("value"));
        driver.findElement(By.id("continue")).click();
    }
    public void clickFinish() {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.findElement(By.tagName("body")).getText());
        WebElement finishButton = driver.findElement(By.id("finish"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", finishButton);
        finishButton.click();
    }
    By completeHeader = By.className("complete-header");
    public String getSuccessMessage() {
       return driver.findElement(completeHeader).getText();
    }
}

