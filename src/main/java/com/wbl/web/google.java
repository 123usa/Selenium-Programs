package com.wbl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");


		WebDriver dr=new ChromeDriver();

	
	
	  dr.get("https://www.google.com/");
	
	//dr.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("laptop");
	
	dr.findElement(By.xpath("//div[@id='gb']/div[1]/div[1]/div[1]/div[2]/a")).click();
	
	
	}

}
