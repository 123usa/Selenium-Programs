package com.wbl.web;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSceenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	

		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();
	
	
	
	  dr.get("https://www.google.com/");
	  TakesScreenshot scrshot=(TakesScreenshot)dr;
	  File src= (scrshot.getScreenshotAs(OutputType.FILE));
	  FileUtils.copyFile(src,new File("C:\\Users\\neeru\\screenshots.png"));
	
	
	dr.get("https://www.yahoo.com/");
	
	TakesScreenshot scrshot1=(TakesScreenshot)dr;
	  File src1= (scrshot1.getScreenshotAs(OutputType.FILE));
	  FileUtils.copyFile(src1,new File("C:\\Users\\neeru\\screenshot1.png"));
	
	
	
	
	
	
	
	
	
	}

}
