package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toolsqaautomation {

	public static void main(String[] args) throws InterruptedException

	
	{
	  
		System.setProperty("chrome.driver.webdriver","C:\\Users\\neeru\\Downloads\\chromedriver_win32");
		
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\neeru\\Downloads\\chromedriver_win32");
	  		
	  WebDriver dr=new ChromeDriver();
	  
	
	    dr.get("https://www.toolsqa.com/automation-practice-form/");
   
	    
	    dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	    
	    WebElement txt = dr.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));



     txt.sendKeys("Neeraja");
	
     dr.manage().window().maximize();

     
     System.out.println(dr.getTitle());
	
	System.out.println("hello world");
	
	dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
			


	 
	//dr.close();
	dr.quit();
	}
}
