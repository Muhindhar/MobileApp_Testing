package com.tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalculatorTest {

    AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setUdid("0841131286051090");
        options.setAppPackage("com.transsion.calculator");
        options.setAppActivity("com.transsion.calculator.Calculator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
    }

    @Test
    public void testAddition() throws Exception {
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

        Assert.assertTrue(result.contains("19"), "Calculator result mismatch!");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
