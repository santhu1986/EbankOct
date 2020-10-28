package com.ebanking.master;

import org.testng.annotations.Test;

public class BrNG extends BaseNg
{
	@Test
    public void Brc() throws InterruptedException 
    {
       LB.Branchcre("managerBranch","Texas","12345","INDIA","GOA","GOA");
    }
}
