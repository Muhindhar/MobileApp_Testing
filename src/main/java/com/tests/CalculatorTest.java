package com.tests;

import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CalculatorTest {

    @Test
    public void addNumbers() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setUdid("0841131286051090");

        options.setAppPackage("com.transsion.calculator");
        options.setAppActivity("com.transsion.calculator.Calculator");

        AndroidDriver driver =
                new AndroidDriver(
                        new URL("http://127.0.0.1:4723"),
                        options);

        Thread.sleep(3000);

        // 2 + 3 + 4 + 10

        driver.findElement(By.xpath("//*[@text='2']")).click();
        driver.findElement(By.xpath("//*[@text='+']")).click();

        driver.findElement(By.xpath("//*[@text='3']")).click();
        driver.findElement(By.xpath("//*[@text='+']")).click();

        driver.findElement(By.xpath("//*[@text='4']")).click();
        driver.findElement(By.xpath("//*[@text='+']")).click();

        driver.findElement(By.xpath("//*[@text='1']")).click();
        driver.findElement(By.xpath("//*[@text='0']")).click();

        driver.findElement(By.xpath("//*[@text='=']")).click();

        Thread.sleep(5000);

        driver.quit();
    }
}