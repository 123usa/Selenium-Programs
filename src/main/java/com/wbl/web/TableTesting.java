package com.wbl.web;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableTesting {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
  @Test
  public void htmlTable()
  {
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://www.w3schools.com/html/html_tables.asp");
	
	
	    dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	
	  String s=dr.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[3]")).getText();
	
	  System.out.println(s);
	
  assertEquals(s,"Mexico");
	
	}

}
