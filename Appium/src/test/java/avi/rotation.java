package avi;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class rotation {
	public static AndroidDriver driver;
    public static void main(String[] args) throws MalformedURLException {
    	UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("POCO F3");
		options.setApp("D:\\Java Selenium\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
		

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

       

        // Change screen orientation to landscape
        driver.rotate(ScreenOrientation.LANDSCAPE);

        // Perform your tests or interactions in landscape mode
        // ...

        // Optionally, change back to portrait mode
        driver.rotate(ScreenOrientation.PORTRAIT);

        // Close the WebDriver
        driver.quit();
    }
}
