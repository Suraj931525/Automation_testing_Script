package com.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.setup;

public class Sign_Up {

    WebDriver driver;

    public Sign_Up() {
        driver = setup.driver;
    }

    public void signup() {
    	Alert alert = driver.switchTo().alert();
    	alert.dismiss();

       
        driver.findElement(
            By.xpath("//div[@data-modal='#modal-register']")
        ).click();

        
        driver.findElement(
            By.xpath("//input[@name='first_name']")
        ).sendKeys("Suraj");

        driver.findElement(
            By.xpath("//input[@name='last_name']")
        ).sendKeys("Patil");

   
        driver.findElement(
            By.xpath("//input[@name='email']")
        ).sendKeys("surajpatil6989@gmail.com");

        driver.findElement(
            By.xpath("//input[@name='mobile']")
        ).sendKeys("9112947889");

        driver.findElement(
            By.xpath("//input[@name='password']")
        ).sendKeys("Suraj@123");

        driver.findElement(
            By.xpath("//button[text()='submit']")
        ).click();
    }
} 