package com.ebanking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NgSample 
{
	WebDriver driver;
	
	@Test
    public void abc() throws InterruptedException
    {
    	driver.get("http://www.google.com");
    	Thread.sleep(3000);
    }
	
	@BeforeMethod
    public void xyz() 
    {
    	driver=new FirefoxDriver();
    	driver.manage().window().maximize();
    }
    
    @Test
    public void pqr() 
    {
    	driver.get("http://122.175.8.158/ranford2");
    }
    @AfterMethod
   public void sdf() throws InterruptedException 
   {
    	Thread.sleep(3000);
	driver.close();   
   }
}

