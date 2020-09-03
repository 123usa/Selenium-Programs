package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	
	  dr.get("https://www.spicejet.com/");
	  
	  Select s=new Select(dr.findElement(By.xpath("//*[contains(@id,'ListCurrency')]")));
	
	  s.selectByValue("AED");
	s.selectByVisibleText("USD");
	s.selectByIndex(1);

   
	
	dr.findElement(By.id("divpaxinfo")).click();
	
	Select sr=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Adult")));
   //dr.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	sr.selectByValue("3");
	
	//thread.sleep(5000);
	dr.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	//dr.close();
	
	Select sr1=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Child")));
	
	sr1.selectByVisibleText("4");
	Select sr2=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Infant")));
	sr2.selectByIndex(2);
	System.out.println("test completed");
	
	}

}
