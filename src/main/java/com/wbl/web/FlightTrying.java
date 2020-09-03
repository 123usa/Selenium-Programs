package com.wbl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightTrying {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	
	
	  dr.get("https://www.aa.com/booking/find-flights?tripType=roundTrip");
	
	dr.findElement(By.id("segments0.travelDate")).click();
	  
	
	
	
	
	
	
	}

}
