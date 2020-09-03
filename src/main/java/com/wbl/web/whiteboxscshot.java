package com.wbl.web;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whiteboxscshot {

	public static void main(String[] args) {
		
	 System.setProperty("chrome.driver.webdriver","C:\\Users\\neeru\\Downloads\\chromedriver_win32")	;
	 WebDriver dr = new ChromeDriver();
	 dr.get("http://www.whiteboxqa.com/login.php");
	 WebElement el = dr.findElement(By.xpath("//*[@id=\"username\"]"));
	 
   el.sendKeys("Nerraja");
   dr.getTitle();
   System.out.println(dr.getTitle());
   System.out.println(dr.getCurrentUrl());
   
   System.out.println(dr.getClass());
   
   System.out.println(dr.getWindowHandle());
   
   System.out.println(dr.getWindowHandles());
   
   
   try
   {
	   File scr=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(scr,new File("C:\\Users\\neeru\\Desktop\\ss.png"));
   
      System.out.println("afterscreenshot");
      
   }
   catch(Exception e)
   {
	   e.printStackTrace();
   }
	 
	 



	}

}
