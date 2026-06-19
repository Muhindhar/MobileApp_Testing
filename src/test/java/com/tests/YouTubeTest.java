package com.tests;

import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class YouTubeTest {

	public static void main(String[] args) throws Exception {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName("Android");
		options.setUdid("0841131286051090");
		options.setAppPackage("com.google.android.youtube");
		options.setAppActivity("com.google.android.apps.youtube.app.WatchWhileActivity");

		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@content-desc='Search']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.google.android.youtube:id/search_edit_text")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(
				io.appium.java_client.android.nativekey.AndroidKey.ENTER));
		Thread.sleep(10000);
		driver.quit();
	}
}