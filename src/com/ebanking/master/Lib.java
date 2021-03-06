package com.ebanking.master;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Lib 

{

	
	 public static WebDriver driver;
	 public static String Expval,Actval;
	 public static FileInputStream FIS;
	 public static Properties PR;
	  

	public String openApp(String Url)
	{
		
		
           Expval="Ranford Bank";
		
		//Launch
		
	 driver=new FirefoxDriver();
		
		//Maximise
		
		driver.manage().window().maximize();
		
		//URL
		
		driver.get(Url);
		
		Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		
		//Comparision
		
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Ranford Home Page Launch Succ");
		}
		else
		{
			System.out.println("Ranford Home Page Not Launch");
		}
		
	return "pass";
		
	}
	
	public void AdminLgn(String Un,String Pwd)
	{
		  
        Expval="Welcome to Admin";
		
		
        driver.findElement(By.id("txtuId")).sendKeys(Un);
		driver.findElement(By.id("txtPword")).sendKeys(Pwd);
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
			
		Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
		
		//Comparision
		
		if (Expval.equalsIgnoreCase(Actval)) 
		{
			System.out.println("Admin Login Succ");
		}
		else
		{
			System.out.println("Admin Login Failed");
		}
		
		
	}
	public String Role(String RN,String RT) throws InterruptedException
	{
		Expval="Sucessfully";
		Thread.sleep(4000);
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
		driver.findElement(By.id("txtRname")).sendKeys(RN);
		driver.findElement(By.id("lstRtypeN")).click();
		driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
		driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
		Thread.sleep(4000);
		String Actval=driver.switchTo().alert().getText();
		
		System.out.println(Actval);
		
		
	      driver.switchTo().alert().accept();
	      driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();  
	      if (Actval.contains(Expval)) 
	      {
	    	  System.out.println("Role Created");
	    	  
			
		}
	      else{
	    	  System.out.println("role not created");
	    	  
	      }
	      return Actval;
	     }



    //BC
	
	public void Branchcre(String Bn,String Add1,String Zc,String cty,String state,String city) throws InterruptedException
	{
		Expval="Sucessfully";		
		
		driver.findElement(By.xpath("//img[@src='images/Branches_but.jpg']")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		
		
		driver.findElement(By.id("txtbName")).sendKeys(Bn);
		driver.findElement(By.id("txtAdd1")).sendKeys(Add1);
		driver.findElement(By.id("txtZip")).sendKeys(Zc);
		
		//dropdown
		
		Select Ctry=new Select(driver.findElement(By.id("lst_counrtyU")));
		Ctry.selectByVisibleText(cty);
		
		Select Sta=new Select(driver.findElement(By.id("lst_stateI")));
		Sta.selectByVisibleText(state);

		Select Cty=new Select(driver.findElement(By.id("lst_cityI")));
		Cty.selectByVisibleText(city);

		driver.findElement(By.id("btn_insert")).click();
		
		Thread.sleep(4000);
		
		//Alert
		
		Actval=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		 driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr/td[1]/a/img")).click();
		//Comparision
		
		if (Actval.contains(Expval)) 
		{
		System.out.println("Branch Created");	
		}
		else
		{
			System.out.println("Branch Already Exist");
		}
		

	}

	//EC
	//Logout
 public void admlgt()
     
     {
    	 driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
    	 
    	 }
//Close
     public void Appc()
     {
    	 driver.close();
     }

}
