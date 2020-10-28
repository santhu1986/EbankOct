package com.ebanking.master;

import org.testng.annotations.Test;

public class BranchNG extends Base
{
    @Test
	public void Br() throws InterruptedException
	{
		Lb.Branchcre("MQsystems","Srnagar","12344","INDIA","GOA","GOA");
	}
}
