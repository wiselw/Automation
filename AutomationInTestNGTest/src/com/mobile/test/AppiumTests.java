package com.mobile.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AppiumTests {
  private WebDriver driver;
  
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	  //File classpathRoot = new File(System.getProperty("user.dir"));
	  //D:/adt-bundle-windows-x86/ContactManager.apk
      //File appDir = new File(classpathRoot, "../../../apps/ContactManager");
      File appPath =new File("D://adt-bundle-windows-x86");
      File app = new File(appPath, "ContactManager.apk");
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability("device","Android");
      capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
      capabilities.setCapability(CapabilityType.VERSION, "4.4");
      capabilities.setCapability(CapabilityType.PLATFORM, "MAC");
      capabilities.setCapability("app", app.getAbsolutePath());
      capabilities.setCapability("app-package", "com.example.android.contactmanager");
      capabilities.setCapability("app-activity", ".ContactManager");
      driver = new SwipeableWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
  }
  @Test
  public void f() throws InterruptedException {
	  WebElement el = driver.findElement(By.name("Add Contact"));
      el.click();
      Thread.sleep(5000);
      List<WebElement> textFieldsList = driver.findElements(By.tagName("textfield"));
      //Thread.sleep(5000);
      textFieldsList.get(0).sendKeys("Some Name");
      textFieldsList.get(2).sendKeys("Some@example.com");
      driver.findElement(By.name("Save")).click();
      Thread.sleep(5000);
  }
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }
  
}
