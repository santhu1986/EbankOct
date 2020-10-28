package com.ebanking.master;

import org.omg.CORBA.portable.ValueOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Library 
{

	
	WebDriver driver;
	String Expval,Actval;
	
	
	public void OpenApp(String Url)
	{
		
 //Expval="Ranford Bank";
		
		//Launch Browser -Firefox
		
	 driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get(Url);
		
//	 Actval=driver.findElement(By.xpath("//span[@class='style10'][contains(.,'Ranford Bank')]")).getText();
//		
//		//Comparision
//		
//		if (Expval.equalsIgnoreCase(Actval)) 
//		{
//			System.out.println("Ranford Home Page Launched Succ");
//		}
//		else
//		{
//			System.out.println("Ranford Home Page Failed to Launch");
//		}
//		
//	
//	
//		
	}
	
	

	public void AdminLgn(String Un,String Pwd) throws InterruptedException
	{/*
	Expval="Welcome to Admin";
		
		driver.findElement(By.id("txtuId")).sendKeys(Un);
		driver.findElement(By.id("txtPword")).sendKeys(Pwd);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		
		//Comparision
		
				if (Expval.equalsIgnoreCase(Actval)) 
				{
					System.out.println("Admin Home Page Launched Succ");
				}
				else
				{
					System.out.println("Admin Home Page Failed to Launch");
				}
				
	
		
*/	
		Thread.sleep(3000);
		
	 driver.findElement(By.partialLinkText("Gm")).click();
	
	}
	

//	public void BranchCre()
	//{
		
		
	//}
	
	
    //Role cre
	
	//Emp cre
	//log out
	//Close
	
	
	
	
}
