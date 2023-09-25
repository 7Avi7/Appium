package avi;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class WifiSettingsName extends BaseTest{
	@Test
	public void AppiumTest() throws MalformedURLException {

				
//		Actual Automation -------->>>>>>>
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click(); 
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		AssertJUnit.assertEquals(alertTitle, "WiFi settings");	
		driver.findElement(By.id("android:id/edit")).sendKeys("Avi Wifi");
		
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
		
//		set wifi name
		
		
		
		
		

}

}
