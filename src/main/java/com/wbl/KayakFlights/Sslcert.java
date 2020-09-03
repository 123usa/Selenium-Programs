package com.wbl.KayakFlights;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

//import org.openqa.selenium.remote.DesiredCapabilities;

public class Sslcert {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

	
	/* dc=DesiredCapabilities.chrome();
	dc.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
	
   ChromeOptions c=new ChromeOptions();
   c.merge(dc);
      */
   
   System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

	WebDriver dr=new ChromeDriver();

  dr.get("www.google.com");
//dr.manage().deleteAllCookies();
//	dr.manage().deleteCookieNamed("sessioncookie");
	
	/*TakesScreenshot scrshot=(TakesScreenshot)dr;
	  File src= (scrshot.getScreenshotAs(OutputType.FILE));
	FileUtils.copyFile(src,new File("C:\\Users\\neeru\\screenshot.png"));*/
	
	
	
	
	}
}
	
	
	

