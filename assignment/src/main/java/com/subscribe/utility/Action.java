package com.subscribe.utility;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.subscribe.base.BaseTest;

public class Action extends BaseTest{
	
	
	
	public void clickElement(By locator) {
		
		driver.findElement(locator).click();

	}
	
	public void sentValue(By locator,String value) {
		
		driver.findElement(locator).sendKeys(value);
	}
	
	public String getValue(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void verifyData(String actual,String expected,String msg) {
		Assert.assertEquals(actual,expected);	
		test.log(Status.INFO,"Verified the "+msg+" is "+expected);
		
	}
}
