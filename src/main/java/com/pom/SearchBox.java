package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.setup;

public class SearchBox {

    WebDriver driver;

    public SearchBox() {
        driver = setup.driver;
    }

    public void search() {

        // Click search box
        driver.findElement(
            By.xpath("//div[@class='search-box']")
        ).click();

        // Enter product name
        driver.findElement(
            By.xpath("//input[@name='q']")
        ).sendKeys("sonam midi dress");
    }
}