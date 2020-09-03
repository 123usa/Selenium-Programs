package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

//C:\\Users\\neeru\\Downloads\\chromedriver_win32
//C:\neeru\workspace\webdriver2019\chromedriver.exe

	WebDriver dr=new ChromeDriver();

	dr.get("https://www.rediff.com/");
	
	dr.findElement(By.cssSelector("a[title*='Sign in']")).click();
	
	dr.findElement(By.xpath("//input[@name='login']")).sendKeys("123usa");
	
	 dr.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
     
	dr.findElement(By.cssSelector("input#password")).sendKeys("pass1");
			
	dr.findElement(By.cssSelector("input[value='Sign in']")).click();
	
	}


}