package com.tests;

import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalculatorTest {

    public static void main(String[] args) throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setUdid("0841131286051090");
        options.setAppPackage("com.transsion.calculator");
        options.setAppActivity("com.transsion.calculator.Calculator");
        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723"),
                options);
        Thread.sleep(3000);
        driver.findElement(By.id("com.transsion.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.transsion.calculator:id/op_add")).click();
        driver.findElement(By.id("com.transsion.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.transsion.calculator:id/op_add")).click();
        driver.findElement(By.id("com.transsion.calculator:id/digit_4")).click();
        driver.findElement(By.id("com.transsion.calculator:id/op_add")).click();
        driver.findElement(By.id("com.transsion.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.transsion.calculator:id/digit_0")).click();
        driver.findElement(By.id("com.transsion.calculator:id/eq")).click();
        Thread.sleep(3000);
        String result = driver.findElement(
                By.id("com.transsion.calculator:id/result"))
                .getAttribute("content-desc");

        System.out.println("Result = " + result);

        driver.quit();
    }
}