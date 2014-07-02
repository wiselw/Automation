package com.automation.test;

import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGTest {
  @Test(dataProvider = "dp")
  public void DataDrivenTestDemo(Integer n, String s) {
	  //AssertJUnit.assertEquals(expected, actual)
	  Reporter.log(s);
  }
  
  @Test(enabled=false)
  public void TestCaseIgnored(){
	  Reporter.log("我是被忽略的用例");
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("@AfterMethod");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a"},
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  Reporter.log("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("@AfterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("@BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("@BeforeTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("@BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("@AfterSuite");
  }

}
