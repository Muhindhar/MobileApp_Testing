package com.tests;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class YouTubeTest {

    AndroidDriver driver;

    @BeforeClass
    public void setup() throws Exception {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setUdid("0841131286051090");
        options.setAppPackage("com.google.android.youtube");
        options.setAppActivity("com.google.android.apps.youtube.app.WatchWhileActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testYouTubeSearch() throws Exception {
        Thread.sleep(5000);

        By searchIcon = By.xpath("//*[@content-desc='Search']");
        By searchBox = By.id("com.google.android.youtube:id/search_edit_text");

        driver.findElement(searchIcon).click();
        Thread.sleep(2000);

        driver.findElement(searchBox).sendKeys("selenium");
        Thread.sleep(2000);

        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(5000);

        Assert.assertTrue(driver.findElements(searchBox).size() > 0,
                "YouTube search action did not execute properly");

        System.out.println("YouTube search for 'selenium' executed successfully");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
