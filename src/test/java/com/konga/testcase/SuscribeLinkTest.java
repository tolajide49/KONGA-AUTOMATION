package com.konga.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.konga.base.TestBase;

public class SuscribeLinkTest extends TestBase{
	
	@Test
	public void Suscribelink() throws InterruptedException {
	
	Thread.sleep(3000);
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	 
	
	WebElement suscribebox =driver.findElement(By.id(OR.getProperty("search_ID")));
	//suscribebox.click();
	Thread.sleep(2000);
	suscribebox.sendKeys(OR.getProperty("email_TEXT2"));
	click("searchbtn_XPATH");
	
	
	Thread.sleep(3000);
	 
	Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("susElement_XPATH"))), "suscribe not successful");
	
	
	}
}
