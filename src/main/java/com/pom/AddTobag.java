package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.setup;

public class AddTobag {

    WebDriver driver;

    public AddTobag() {
        driver = setup.driver;
    }

    public void addBag() {

        // Add to bag
        driver.findElement(
            By.xpath("//span[text()='add to bag']")
        ).click();

        // Checkout
        driver.findElement(
            By.xpath("//a[text()='checkout']")
        ).click();
    }
}