package com.unit.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.unity.TestNGCaseBase;

public class TestNGCaseBaseTests extends TestNGCaseBase {
	@BeforeMethod
	public void beforeMethod(){
		super.beforeMethod();
		log.put("step0:beforeMethod", true);
	}
  @Test
  public void testReport() {
	  log.put("step1:≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘≤‚ ‘", true);
	  log.put("step2:Open ", true);
  }
  @Test
  public void testResult() {
	  log.put("step1:Open baidu website", true);
	  log.put("step2: website", true);
  }
  @Test
  public void testOver() {
	  log.put("step1:Open baidu website", false);
  }
//  @BeforeClass
//  public void beforeClass() {
//  }
//
//  @AfterClass
//  public void afterClass() {
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//  }
//
//  @AfterTest
//  public void afterTest() {
//  }

}
