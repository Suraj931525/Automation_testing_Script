package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.setup;

public class AddToWishList {

    WebDriver driver;

    public AddToWishList() {
        driver = setup.driver;
    }

    public void addToWishList() {

        driver.findElement(
            By.xpath("//button[@data-wish='2111']")
        ).click();
    }
}