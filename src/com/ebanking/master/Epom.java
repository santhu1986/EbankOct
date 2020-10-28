package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Epom 
{
	
	WebDriver driver;
	
    @BeforeTest
	public void login() 
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2");
		
//Page Factory
		
 		RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
        RHP.login();
        
	}
		@Test(dataProvider="Rdata")
		public void Rolcre(String Rn,String Rt) throws InterruptedException 
		{
			
        AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
        AHP.Rol();
        
        Thread.sleep(3000);
        
        RoleDetails RD=PageFactory.initElements(driver,RoleDetails.class);
        RD.Nrol();
        
        Rcreation RCre=PageFactory.initElements(driver,Rcreation.class);
        RCre.RC(Rn,Rt);
        
        Thread.sleep(3000);
        
        //Alert
        
        driver.switchTo().alert().accept();
        
        //Home
        
        RD.Hom();
		}
        //Branch button
        
        //AHP.Br();
		   @DataProvider
		    
		    public Object[][] Rdata()
		    {
		    	Object[][] Obj=new Object[3][2];
		    	
		    	Obj[0][0]="TesterMQs";
		    	Obj[0][1]="E";
		    	

		    	Obj[1][0]="ManagerMQs";
		    	Obj[1][1]="E";
		    	

		    	Obj[2][0]="CashierQs";
		    	Obj[2][1]="E";
		    	
		    	return Obj;
		    	
		    }

}
