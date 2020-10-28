package com.ebanking.master;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseNg 
{
  Lib LB=new Lib();
  
  @BeforeTest
  public void beforeTest() 
  {
  LB.AdminLgn("Admin","M1ndq");
  }

  @AfterTest
  public void afterTest() 
  {
  LB.admlgt();
  }

  @BeforeSuite
  public void beforeSuite()
  {
  LB.openApp("http://122.175.8.158/ranford2");
  }

  @AfterSuite
  public void afterSuite() 
  {
  LB.Appc();
  }

}
