package com.mvn.test.simplemavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ApplicationLaunch {
	public static WebDriver driver;
  @Test
  public void launchBrowserC() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\.chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }
  @Test
  public void CraiglistPage() {
	  driver.get("https://sfbay.craigslist.org/");
	  driver.close();
  }
}
