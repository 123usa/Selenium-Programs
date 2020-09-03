package com.wbl.web;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	
	
	
	dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	
	  dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 int n=dr.findElements(By.tagName("a")).size();
	
	  System.out.println(n);
	 
	  //footer links
	  
	  WebElement footer=dr.findElement(By.id("gf-BIG"));
	
	  int footerlinks=footer.findElements(By.tagName("a")).size();
	   System.out.println(footerlinks);
	   
	
	//column links
	   
	   
	   WebElement columnDriver=footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	
	
	int columnlinkd=columnDriver.findElements(By.tagName("a")).size();
	System.out.println(columnlinkd);
	
	for(int i=1;i<columnlinkd;i++)
	{
		String linkclick=Keys.chord(Keys.CONTROL,Keys.ENTER);
		columnDriver.findElements(By.tagName("a")).get(i).sendKeys(linkclick);
	}
	     Set<String> handle=dr.getWindowHandles();
	      
	       Iterator<String> it=handle.iterator();
	       
	
	    while(it.hasNext())
	
	    {
	    	dr.switchTo().window(it.next());
	        System.out.println(dr.getTitle());
	    
	    

	
	
	
	}
	
	
	
	
	
	}

}
