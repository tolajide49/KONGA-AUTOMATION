package com.konga.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.konga.base.TestBase;

public class Help extends TestBase {
	
	@Test
	public void FAQ() throws InterruptedException {
		click("help_XPATH");
		Thread.sleep(3000);
		click("FAQ_XPATH");
		Thread.sleep(3000);
		
		Assert.assertTrue(isElementPresent(By.linkText(OR.getProperty("Element_LinkText"))),"page no correct");	
	}
	
	@Test
	public void ContactUs () throws InterruptedException {
		click("help_XPATH");
		Thread.sleep(3000);
		click("Contact_XPATH");
		
		
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("Element_Xpath"))), "incorrect page");
	}

	
}
