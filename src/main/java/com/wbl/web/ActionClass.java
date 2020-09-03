package com.wbl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	  dr.get("https://www.amazon.com/");
	  Actions a=new Actions(dr);
	  a.moveToElement(dr.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("neeraja").doubleClick().build().perform();
	  
	
	  WebElement el=dr.findElement(By.cssSelector("span[class='nav-line-1']"));
	  a.moveToElement(el).contextClick().build().perform();
	
	
	
	
	}

}
