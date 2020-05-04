package com.konga.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.konga.base.TestBase;

public class Logout extends TestBase{


	@Test
	public void LogoutTest () throws InterruptedException {

		click("HomeloginBtn_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.id(OR.getProperty("email_ID"))).sendKeys(OR.getProperty("email_TEXT"));
		driver.findElement(By.id(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("password_TEXT"));		
		click("loginBtn_XPATH");
		Thread.sleep(4000);


		Actions action = new Actions(driver);
		WebElement we =driver.findElement(By.xpath(OR.getProperty("Account_Xpath")));
		action.moveToElement(we).moveToElement(driver.findElement(By.xpath(OR.getProperty("Logout_Xpath")))).click().build().perform();


		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("loginBtn_XPATH"))), "logout not sucessfull");


	}
}
