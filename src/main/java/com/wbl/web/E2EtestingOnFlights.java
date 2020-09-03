package com.wbl.web;

import java.util.concurrent.TimeUnit;

//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2EtestingOnFlights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
	    dr.get("https://www.spicejet.com/");
	    dr.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	      //Dynamic DropDowns
	    dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		dr.findElement(By.xpath("//a[@value='BLR']")).click();
		dr.findElement(By.xpath("//div[@id='content-change'] //a[@value='MAA']")).click();
		
		
		//cALENDAR
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		  dr.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		  
		  if(dr.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
							
			{
			   System.out.println("RETURN is DISABLED");
		       Assert.assertTrue(true);
			}
	    else
	      {
		 Assert.assertTrue(false);
		 
	      }

	
			
			//SELECT CURRENCY
			
			 
			  Select s=new Select(dr.findElement(By.xpath("//*[contains(@id,'ListCurrency')]")));
			   s.selectByValue("AED");
		
	
			 //SELECT PASSENGERS
				  dr.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
				    dr.findElement(By.id("divpaxinfo")).click();
					
					Select sr=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Adult")));
					dr.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
					sr.selectByValue("3");		  
					dr.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
					Select sr1=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Child")));
					
					sr1.selectByVisibleText("4");
					Select sr2=new Select(dr.findElement(By.id("ctl00_mainContent_ddl_Infant")));
					sr2.selectByIndex(2);
			
					
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   //SELECT CHECKBOX
			   dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
			   
			  //CLICKING ON SEARCH
			   
			   dr.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
