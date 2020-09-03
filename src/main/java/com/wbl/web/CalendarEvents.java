package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();
	
	
	  dr.get("https://www.path2usa.com/travel-companions");
	
	  dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //.findElement(By.id("travel_date")).click();
	    
	//dr.findElement(arg0)
	//dr.findElement(By.xpath("//input[@id='travel_date']")).click();
	
	
	
	
	
	
	}

}
