package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleNg 
{
	WebDriver driver;
	
	
	@BeforeMethod
	public void xyz()
	{
	//Assert.assertEquals("Selenium","Selenium");	
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	}
    @Test
	public void abc()
	{
		driver.get("http://www.google.com");
		//Assert.assertEquals("TestNg","TestNg");	
	}
	@Test
	public void pqr()
	{
		driver.get("http://www.facebook.com");
		//Assert.assertEquals("Automation","Automation");
	}
@AfterMethod
public void Aclose()
{
	driver.close();
}
}
