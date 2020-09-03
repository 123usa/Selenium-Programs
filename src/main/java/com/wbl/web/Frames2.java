package com.wbl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();
	   dr.get("https://the-internet.herokuapp.com/");
	   
	   dr.findElement(By.linkText("Nested Frames")).click();

	  System.out.println( dr.findElements(By.tagName("frame")).size());
	  // dr.switchTo().frame(dr.findElement(By.cssSelector("frameset[name='frameset-middle']/frame[2]")));

     //  System.out.println(dr.findElement(By.cssSelector("frameset[name='frameset-middle']/frame[2]")).getText());
	  dr.switchTo().frame(0);
	//dr.switchTo().frame("frame-top");
	dr.switchTo().frame("frame-middle");
	System.out.println(dr.findElement(By.id("content")).getText());
	
	
	
	
	
	}
	

	
}