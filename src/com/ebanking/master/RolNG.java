package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RolNG extends BaseNg
{
	@Test(dataProvider="Rdata")
  public void RNg(String Rn,String Rt) throws InterruptedException
  {
	  LB.Role(Rn,Rt);
  }
	
	@DataProvider
	
	public Object [][] Rdata()
	{
		
		Object[][] Obj=new Object[3][2];
		
		Obj[0][0]="CashierRekha";
		Obj[0][1]="E";
		
		Obj[1][0]="PoRekha";
		Obj[1][1]="E";
		
		Obj[2][0]="AMRekha";
		Obj[2][1]="E";
		
		return Obj;
	}
}
