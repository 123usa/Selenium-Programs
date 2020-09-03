package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

WebDriver dr=new ChromeDriver();

   dr.get("http://www.whiteboxqa.com/");
   
   WebElement el=dr.findElement(By.xpath("//*[@id=\"loginButton\"]"));
  try 
  {

Thread.sleep(10);
	  
		  
  }
   catch(Exception e)
  
  {
	   e.printStackTrace();
  }
   
   
   //.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  el.click();
   
	System.out.println("Hello World");
	
	
	}

}
