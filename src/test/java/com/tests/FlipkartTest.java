package com.tests;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
public class FlipkartTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		UiAutomator2Options opt = new UiAutomator2Options();
		opt.setPlatformName("Android");
		opt.setUdid("0841131286051090");
		
		opt.setAppPackage("com.flipkart.android");
		opt.setAppActivity("com.flipkart.android.activity.HomeFragmentHolderActivity");
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Flipkart\"]")).click();
		driver.findElement((By.xpath("//android.widget.FrameLayout[@content-desc=\"Home screen 1 of 3\"]/android.view.View")));
		driver.findElement((By.xpath("//android.view.ViewGroup[@content-desc=\"laptops\"]/android.widget.TextView"))).sendKeys("Cricket bat");
		driver.pressKey(new io.appium.java_client.android.nativekey.KeyEvent(
				io.appium.java_client.android.nativekey.AndroidKey.ENTER));
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Sponsored, 80%, ₹1,599, ₹305, Hot Deal, Delivery by,  24th Jun\"]/android.view.ViewGroup[1]"));
		
		
				
		
	}

}
