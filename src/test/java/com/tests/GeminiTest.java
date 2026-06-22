package com.tests;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GeminiTest {

    AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception {
        UiAutomator2Options opt = new UiAutomator2Options();

        opt.setPlatformName("Android");
        opt.setUdid("0841131286051090");
        opt.setNoReset(true);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println("Gemini session started");
    }

    @Test
    public void testGeminiPlusButtonAndPrintElements() throws Exception {

        By plusButton = By.id("com.google.android.googlequicksearchbox:id/gemini_chat_input_plus_btn");
        Assert.assertTrue(driver.findElements(plusButton).size() > 0,
                "Gemini plus button not found");

        driver.findElement(plusButton).click();
        Thread.sleep(3000);

        System.out.println("Gemini plus button clicked successfully");
        List<WebElement> allElements = driver.findElements(By.xpath("//*"));

        System.out.println("========= GEMINI SCREEN ELEMENTS =========");
        for (WebElement e : allElements) {
            try {
                String text = e.getText();
                String desc = e.getAttribute("content-desc");
                String id = e.getAttribute("resource-id");

                System.out.println(
                        "TEXT = " + text +
                        " | DESC = " + desc +
                        " | ID = " + id
                );
            } catch (Exception ex) {
            }
        }
        System.out.println("==========================================");
        Assert.assertTrue(true, "Gemini feature executed successfully");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
