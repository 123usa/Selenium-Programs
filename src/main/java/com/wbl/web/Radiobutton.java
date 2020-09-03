package com.wbl.web;






import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] st)

 {
	boolean condition;	
		
	System.setProperty("chrome.driver.webdriver","C:\\Users\\neeru\\Downloads\\chromedriver_win32");
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\neeru\\Downloads\\chromedriver_win32");
	
  WebDriver dr =new ChromeDriver();
  dr.get("https://www.toolsqa.com/automation-practice-form/");
  
//WebElement webelement=dr.findElements(By.name("sex"));

dr.manage().window().maximize();




List < WebElement> r1=dr.findElements(By.name("sex"));

  if(r1.get(1).isSelected())
  {
	  r1.get(0).click();
    dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  System.out.println("male");
     
   
  }

  else
  {
	  

      r1.get(0).click();
      dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      System.out.println("male");

	}

  dr.close();
 
 }

}