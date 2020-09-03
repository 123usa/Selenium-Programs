package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoDROP1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    int i=0;
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();
	

	  
	//  dr.get("https://www.makemytrip.com/flights/?ccde=us");
	  dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  
	/*  dr.findElement(By.cssSelector("input[class='react-autosuggest__input react-autosuggest__input--open']")).click();
	
	
	*/
		
	dr.get("https://ksrtc.in/oprs-web/");
	dr.findElement(By.id("fromPlaceName")).click();
	
	dr.findElement(By.id("fromPlaceName")).sendKeys("beng");
	Thread.sleep(2000);
	
	dr.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
	dr.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
	//dr.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
	
	dr.findElement(By.id("fromPlaceName")).getText();

	
	JavascriptExecutor js=(JavascriptExecutor)dr;
	
	String script="return document.getElementById(\"fromPlaceName\").value;";
	String text=(String) js.executeScript(script);
	
	//System.out.println(text);
	
	
	
	while(!text.equalsIgnoreCase("BENGALURU"))
	
	{
		i++;
		
		dr.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_UP);
	
	 text=(String) js.executeScript(script);
		
	   System.out.println(text);
	   
	if(i>10)
		
	{
		System.out.println("element not found");
		
		
		break;
	
	
	
	
	}
	

	}
	
	
	
	}

}
