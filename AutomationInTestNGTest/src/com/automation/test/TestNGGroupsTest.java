package com.automation.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroupsTest {
  @Test(groups={"group1"})
  public void TestCase1() {
	  Reporter.log("TestCase1");
	  Reporter.log("group1");
  }
  
  @Test(groups={"group2","group3"})
  public void TestCase2() {
	  Reporter.log("TestCase2");
  }
  
  @Test(groups={"group2"})
  public void TestCase3() {
	  Reporter.log("TestCase3");
  }
  @Test(groups={"group3"})
  public void TestCase4() {
	  Reporter.log("TestCase4");
  }
  @Test(groups={"group1","group3"})
  public void TestCase5() {
	  Reporter.log("TestCase5");
  }
  
}
