package avi;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class LongPress extends BaseTest{
	@Test
	public void LongPressGesture() throws MalformedURLException, InterruptedException {

				
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
//		WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
//		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
//			    "elementId",((RemoteWebElement)ele).getId(),"duration",2000));
		
		longPressAction(ele);
		
		String menuText =	driver.findElement(By.id("android:id/title")).getText();
		AssertJUnit.assertEquals(menuText, "Sample menu");
		AssertJUnit.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());

}

}
