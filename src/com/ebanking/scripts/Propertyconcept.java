package com.ebanking.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propertyconcept {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		FileInputStream FIS=new FileInputStream("E:\\SeleniumonlineSep\\Ebanking\\src\\com\\ebanking\\properties\\Rep.properties");
	     Properties Pr=new Properties();
	     Pr.load(FIS);
		
	WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.id(Pr.getProperty("Uname"))).sendKeys("Admin");
		driver.findElement(By.id(Pr.getProperty("Pswd"))).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(Pr.getProperty("Lgn"))).click();
	
	}

}
