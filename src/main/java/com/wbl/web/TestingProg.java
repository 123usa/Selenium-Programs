package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  System.setProperty("driver.chrome.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");
	  
	 WebDriver driver=new ChromeDriver();
	 
	 
	driver.get("https://www.yahoo.com/");
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//WebElement el=driver.findElement(By.xpath("//a[text()='Sports']"));
	
	//WebElement el=driver.findElement(By.xpath("//ul[@id='header-nav-bar']/li[5]/a"));
	//WebElement el=driver.findElement(By.xpath("//ul[contains(@class,'Mstart')]/li[1]/a"));
	
	//WebElement el=driver.findElement(By.xpath("//*[text()='Coronavirus'][2]"));
	
	WebElement el=driver.findElement(By.xpath("//a[contains(@href,'Coronavirus')]"));
	
	//WebElement el=driver.findElement(By.xpath("//*[text()='Coronavirus'][2]"));
	//driver.close();
	
	 el.click();
	
	
	}

}
