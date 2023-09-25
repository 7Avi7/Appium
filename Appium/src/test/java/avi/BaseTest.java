package avi;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	
	
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException  {
//		AndroidDriver, IOSDriver
		
//		Code To Start Server------->>>>>>
		
		
//		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\USER\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
//				
//				.withIPAddress("127.0.0.1:4723")
//				.usingPort(4723)
//				.build();
//				service.start();
		
//		Using map
//		Map<String , String> env = new HashMap<String , String>(System.getenv());
//		env.put("ANDROID_HOME", "/Users/ksks/Library/Android/sdk");
//		env.put("JAVA_HOME", "/Library/Java/JavaVirtualMachines/amazon-corretto-11.jdk/Contents/Home");
//		 
//		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\\\Users\\\\USER\\\\AppData\\\\Roaming\\\\npm\\\\node_modules\\\\appium\\\\lib\\\\main.js"))
//		.withIPAddress("127.0.0.1").usingPort(4723).withEnvironment(env).build();
//		service.start();
//		System.out.println("server started");
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("POCO F3");
		options.setApp("D:\\Java Selenium\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		
//		127.0.0.1:4723

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	
	
	
	public void longPressAction(WebElement ele) {
		
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId",((RemoteWebElement)ele).getId(),"duration",2000));
	}
	
	public void scrollToEndAction() throws InterruptedException {
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		Thread.sleep(2000);
	}
	
	
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				"elementId", ((RemoteWebElement)ele).getId(),
			 
			    "direction", direction,
			    "percent", 0.75
			));
		
		
	}
	
	
	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
//		service.stop();
	}

}
