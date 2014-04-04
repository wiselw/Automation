package com.mobile.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasTouchScreen;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteTouchScreen;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class APPTests {
	private WebDriver driver;
	  @BeforeMethod
	  public void beforeMethod() throws MalformedURLException {
		  //File classpathRoot = new File(System.getProperty("user.dir"));
		  //D:/adt-bundle-windows-x86/ContactManager.apk
	      //File appDir = new File(classpathRoot, "../../../apps/ContactManager");
	      File appPath =new File("D://adt-bundle-windows-x86");
	      File app = new File(appPath, "ctrip_531_9013.apk");
	      DesiredCapabilities capabilities = new DesiredCapabilities();
	      capabilities.setCapability("device","Android");
	      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
	      capabilities.setCapability(CapabilityType.VERSION, "4.4");
	      //capabilities.setCapability(CapabilityType.PLATFORM, "MAC");
	      capabilities.setCapability("app", app.getAbsolutePath());
	      capabilities.setCapability("app-package", "ctrip.android.view");
	      capabilities.setCapability("app-activity", "ctrip.android.view.home.CtripSplashActivity");
	      driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	      //driver = new SwipeableWebDriver(, capabilities);
	  }
	  @Test
	  public void f() throws InterruptedException {
		  Thread.sleep(30000);
		  // driver.navigate().forward();
		  // driver.navigate().forward();
		  //((SwipeableWebDriver)driver).getTouch().scroll(0, 0);
		  System.out.println(driver.getPageSource());
		  WebElement el = driver.findElement(By.name("ÎÒµÄÐ¯³Ì"));
		  
	      el.click();
	      Thread.sleep(50000);
	  }
	  @AfterMethod
	  public void afterMethod() {
		  driver.quit();
	  }
}
