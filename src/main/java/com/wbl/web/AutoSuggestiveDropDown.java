package com.wbl.web;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	    dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    dr.findElement(By.id("autosuggest")).sendKeys("ind");
	    dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 List<WebElement>  option= dr.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
	      for(WebElement options:option)
	    	  
	      {
	    	  if(options.getText().equalsIgnoreCase("India"))
	    	  {
	                  options.click();
	                  break;
	    	  }
	      }
	
	
	   System.out.println("test completesd");
	
	}

}
