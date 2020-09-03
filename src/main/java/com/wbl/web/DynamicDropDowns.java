package com.wbl.web;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	
	  dr.get("https://www.spicejet.com/");
	dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	dr.findElement(By.xpath("//a[@value='BLR']")).click();
	//dr.findElement(By.xpath("//a[@value='MAA']")).click();
	
	dr.findElement(By.xpath("//div[@id='content-change'] //a[@value='MAA']")).click();
	
	
	       //.ui-state-default.ui-state-highlight.ui-state-active
	
	
	  dr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	
	
	
	//dr.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
	
	System.out.println(dr.findElement(By.id("Div1")).getAttribute("style"));
	
	
	dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
	
	System.out.println(dr.findElement(By.id("Div1")).getAttribute("style"));
	
	//dr.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
	
	if(dr.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	
	
			{
		
		
		     System.out.println("this is enabled");
		       Assert.assertTrue(true);
			}
	else
	{
		 Assert.assertTrue(false);
		 
	}
	
	
	
	
	
	}

}
