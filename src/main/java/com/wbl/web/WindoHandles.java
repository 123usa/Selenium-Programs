package com.wbl.web;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindoHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

		 dr.get("https://the-internet.herokuapp.com/windows");	
		
		 dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	
	  dr.findElement(By.xpath("//a[text()='Click Here']")).click();
	
	//dr.findElement(By.linkText("Click Here"));
	
	
	//dr.findElement(By.xpath("//input[text()='Click Here']")).click();
	
	
	  Set<String> handles=dr.getWindowHandles();
	  Iterator<String> it=handles.iterator();
	  
	  String parent=it.next();
	 

 System.out.println(dr.findElement(By.cssSelector("div.example")).getText());
	  
	  String childid=it.next();
	
	 dr.switchTo().window(childid);
	  
	 System.out.println(dr.findElement(By.cssSelector("div.example")).getText());
	  
	 dr.switchTo().window(parent);
	  
	  System.out.println(dr.findElement(By.cssSelector("div.example")).getText());
	
	
	
	
	
	
	
	
	}

}
