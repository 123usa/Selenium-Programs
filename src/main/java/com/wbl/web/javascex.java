package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascex {

	public static void main(String[] args) {


       WebDriver dr = new ChromeDriver();
       dr.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
       
    dr.get("https://www.walmart.com/");
    JavascriptExecutor js = (JavascriptExecutor) dr;
    
    js.executeScript("window.scrollBy(0,600)");


       
       
       
	}

}
