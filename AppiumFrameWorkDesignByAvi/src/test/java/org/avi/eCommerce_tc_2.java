package org.avi;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.HashMap;

import org.avi.TestUtils.AndroidBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;



public class eCommerce_tc_2 extends AndroidBaseTest{

	@BeforeMethod
	public void preSetup() throws InterruptedException
	{
//		Thread.sleep(3000);
//		//screen to home page
//		Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
//		driver.startActivity(activity);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "POCO F3");
		capabilities.setCapability("platformName", "ANDROID");
		capabilities.setCapability("appPackage", "com.androidsample.generalstore");
		capabilities.setCapability("appActivity", "com.androidsample.generalstore.MainActivity");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("platformVersion", "14");
		capabilities.setCapability("udid", "a253319a");
		capabilities.setCapability("noReset", true); // To prevent clearing app data between test runs
		capabilities.setCapability("fullReset", false);
		
		
	}
	
	@Test

	public void FillForm_ErrorValidation() throws InterruptedException
	{
		
	//	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Rahul Shetty");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		String toastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		AssertJUnit.assertEquals(toastMessage,"Please your name");
		
		
			
	}
	

	@Test
	public void FillForm_PositiveFlow() throws InterruptedException

	
	{
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Avi");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		AssertJUnit.assertTrue(driver.findElements(By.xpath("(//android.widget.Toast)[1]")).size()<1);
		
			
	}
}
