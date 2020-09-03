package com.wbl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

		 dr.get("https://rahulshettyacademy.com/AutomationPractice/");
		 dr.findElement(By.id("name")).sendKeys("Neeraja");
		dr.findElement(By.id("alertbtn")).click();
	
	    System.out.println(dr.switchTo().alert().getText());
	    
	    dr.switchTo().alert().accept();

	    dr.findElement(By.id("confirmbtn")).click();
	    
	    //dr.findElement(By.id("confirmbtn"))
	    System.out.println(dr.switchTo().alert().getText());
	    dr.switchTo().alert().dismiss();
	
	
	
	
	
	
	
	
	}

}
