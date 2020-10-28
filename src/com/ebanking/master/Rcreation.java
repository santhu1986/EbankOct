package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Rcreation 
{

	@FindBy(id="txtRname")
	WebElement Rname;
	
	@FindBy(id="lstRtypeN")
	WebElement Rtyp;
	
	@FindBy(xpath=".//*[@id='btninsert']")
	WebElement Rsub;
	
	public void RC(String Rn,String Rt) 
	{
		Rname.sendKeys(Rn);
		Select RT=new Select(Rtyp);
		RT.selectByVisibleText(Rt);
		Rsub.click();
	}
	
	
}
