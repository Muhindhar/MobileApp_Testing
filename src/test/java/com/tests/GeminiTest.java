package com.tests;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class GeminiTest {
    public static void main(String[] args) throws Exception {

        UiAutomator2Options opt = new UiAutomator2Options();

        opt.setPlatformName("Android");
        opt.setUdid("0841131286051090");
        opt.setNoReset(true);

        AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"),opt);
        System.out.println("Session Started");
        /*
        driver.findElement(By.id("com.google.android.googlequicksearchbox:id/assistant_robin_input_collapsed_text_half_sheet")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.id("com.google.android.googlequicksearchbox:id/assistant_robin_input_collapsed_text_half_sheet")).sendKeys("What is Appium?");
        	Thread.sleep(2000);
        	driver.findElement(By.id("com.google.android.googlequicksearchbox:id/assistant_robin_input_send_button_compose")).click();
        	Thread.sleep(10000);
        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button")).click();
        //Thread.sleep(10000);
        //driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button")).click();
        	//image-creation
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.widget.Button")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.widget.TextView")).click();
        driver.findElement(By.className("android.widget.Button")).click();
        driver.findElement(By.id("com.google.android.googlequicksearchbox:id/assistant_robin_input_collapsed_text_half_sheet")).sendKeys("create an image of car going in the national highways");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.support.v7.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.Button")).click();
        Thread.sleep(10000);
        System.out.println("image created");*/
        
        
     // Print all clickable texts and descriptions
        driver.findElement(
        	    By.id("com.google.android.googlequicksearchbox:id/gemini_chat_input_plus_btn"))
        	    .click();

        	Thread.sleep(3000);

        driver.findElements(By.xpath("//*")).forEach(e -> {
            try {
                System.out.println(
                    "TEXT = " + e.getText() +
                    " | DESC = " + e.getAttribute("content-desc") +
                    " | ID = " + e.getAttribute("resource-id"));
            } catch(Exception ex) {}
        });
    }
}