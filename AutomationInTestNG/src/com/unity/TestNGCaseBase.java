package com.unity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNGCaseBase {
	private long duration;
	private long startime;
	private long endtime;
	private int i = 0;
	private String prefix = "AutomationInTestNG_";	
	public  Map<String, Boolean> log = new HashMap();
	private HTMLReport res = new HTMLReport();
	@BeforeClass
	public void beforeClass(){
		//
		try {
			res.generateReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@BeforeMethod
	public void beforeMethod(){
		startime=System.currentTimeMillis();
	}
	@AfterMethod
	public void afterMethod(ITestResult result) throws Exception{
		//
		int testno = i++;
		endtime = System.currentTimeMillis();
		duration = endtime - startime;
        BigDecimal i=BigDecimal.valueOf(duration);
		System.out.println();
		res.sendStatusToReport(testno, prefix+testno, i.divide(BigDecimal.valueOf(1000)), "test", result,log);
	}
	@AfterClass
	public void afterClass(){
		//
		try {
			res.SaveReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
