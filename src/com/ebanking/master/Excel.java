package com.ebanking.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Excel {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		WebDriver driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		
		

	
	//To get the Excel File
		
		FileInputStream Fis=new FileInputStream("C:\\Users\\santh\\Desktop\\Role.xlsx");
	
		//WorkBook
		
		XSSFWorkbook WB=new XSSFWorkbook(Fis);
		
		//Sheet
		
		XSSFSheet WS=WB.getSheet("Ldata");
		
		//Row Count
		
		int Rc=WS.getLastRowNum();
		System.out.println(Rc);
		
	//Multiple Iterations---------For Loop

		
		for (int i=1;i<=Rc;i++) 
		{
		
			//Row
			
			XSSFRow WR=WS.getRow(i);
			
			//Cell
			
			XSSFCell WC=WR.getCell(0);
			XSSFCell WC1=WR.getCell(1);
			
			XSSFCell WC2=WR.createCell(2);
			
			//Cell Values
			
			String Un=WC.getStringCellValue();
			String Pwd=WC1.getStringCellValue();
			
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(Un);
			
			Thread.sleep(3000);
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(Pwd);
			
		
			WC2.setCellValue("Pass");
			
			
		}
	
	//Results
		
		FileOutputStream Fos=new FileOutputStream("C:\\Users\\santh\\Desktop\\RoleResults.xlsx");
	    WB.write(Fos);
	    WB.close();
	}

}
