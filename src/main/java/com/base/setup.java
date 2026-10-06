package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setup {

    public static WebDriver driver;

    public static void initializeDriver() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts()
               .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.bhaane.com/");
    }

    public static void closeDriver() {

        if (driver != null) {
            driver.quit();
        }
    }
}