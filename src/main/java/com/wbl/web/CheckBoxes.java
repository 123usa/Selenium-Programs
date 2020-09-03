package com.wbl.web;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	
	  dr.get("https://www.spicejet.com/");
	  
	  dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
	
	  boolean f=dr.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected();
	  
	    System.out.println(f);

	  
	 
	    assertTrue(f);
	    
	    //count the radio buttons
	    
	   System.out.println(dr.findElements(By.cssSelector("input[type='checkbox']")).size());
	  
	  


	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

	
	
	
	
	
	
	
	
	
	
	}

}
