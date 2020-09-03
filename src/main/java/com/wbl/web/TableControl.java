package com.wbl.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int sum=0;
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	
	  dr.get("https://www.cricbuzz.com/live-cricket-scorecard/23252/eng-vs-pak-2nd-t20i-pakistan-tour-of-england-2020");
	
	
	WebElement table=dr.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
	int rowcount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();;
	int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	
	System.out.println(count);
	
	for(int i=0;i<count-2;i++)
		
		
	{
		 
		String s=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	     //System.out.println(s);
	     int n=Integer.parseInt(s);
	     sum=sum+n;
	
	}
	
	
	
	//System.out.println("extras:");
	String s=dr.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();

	    int n=Integer.parseInt(s);
	   sum=sum+n;
	 System.out.println(sum);
	 
	 String Actualamt=dr.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
	    
	  int p=Integer.parseInt(Actualamt);


	  
	  
	  if(sum==p)
		  System.out.println("count matching");
	  else
		  System.out.println("count is not matching");
	  
	  
	
	
	
	
	
	}

}
