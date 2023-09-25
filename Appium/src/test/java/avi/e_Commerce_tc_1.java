package avi;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class e_Commerce_tc_1 extends BaseTest2{
	@Test
	public void FillForm() throws InterruptedException {
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("MA");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		driver.findElement(By.id("android:id/text1")).click();
		scrollToEndAction();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Bangladesh']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
//		String toastMessage = driver.findElement(By.xpath("(android.widget.Toast)[1]")).getAttribute("name");
//		Assert.assertEquals(toastMessage, "Please enter your name");
		
		
		scrollToEndActionForShoe();
		
		
		int productCount =	driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		
		for(int i =0;i<productCount;i++)
		{
			String productName =driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			
			if(productName.equalsIgnoreCase("Jordan 6 Rings"))
			{
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
			}
		}
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")),"text" , "Cart"));
		String lastPageProduct =driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		AssertJUnit.assertEquals(lastPageProduct, "Jordan 6 Rings");
		
	}

}
