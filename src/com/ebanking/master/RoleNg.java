package com.ebanking.master;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RoleNg extends Base
{
    @Test(dataProvider="Rdata")
	public void Rol(String Rn,String Rt) throws InterruptedException 
	{
		Lb.Role(Rn,Rt);
	}
    
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
