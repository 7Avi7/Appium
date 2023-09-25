package avi;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class MisceallanousAppiumActions extends BaseTest{

	@SuppressWarnings("deprecation")
	@Test
	public void AppiumTest() throws MalformedURLException {

				
//		Actual Automation -------->>>>>>>
		
		Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		driver.startActivity(activity);
		driver.findElement(By.id("android:id/checkbox")).click();
		DeviceRotation landScape = new DeviceRotation(0, 0, 90);
		driver.rotate(landScape);		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click(); 
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		AssertJUnit.assertEquals(alertTitle, "WiFi settings");	
		//copy paste
		//copy to clipboard- paste it clipboard
		
		driver.setClipboardText("Avi Wifi");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.longPressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		
		
//		set wifi name
		
		
		
		
		

}
    	
}