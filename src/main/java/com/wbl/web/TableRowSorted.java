package com.wbl.web;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableRowSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();

	    dr.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	
	    
	    dr.findElement(By.cssSelector("tr th:nth-child(2)")).click();
	   // dr.findElement(By.cssSelector("tr th:nth-child(2)")).click();

	    
	    List<WebElement>   el= dr.findElements(By.cssSelector("tr td:nth-child(2)"));
	
	   ArrayList<String> OriginalList=new ArrayList<String>();
	   
	
	    for(int i=0;i<el.size();i++)
	    {
	    	
	    
	      OriginalList.add(el.get(i).getText());
	    
	    
	    }
	
	ArrayList<String>  copiedList=new ArrayList<String>();
	
	
	for(int i=0;i<el.size();i++)
	{
		copiedList.add(el.get(i).getText());
	    
	    
	}
	
	
	Collections.sort(copiedList);
	Collections.reverse(copiedList);
System.out.println("***********Orignal");
for(String s:OriginalList)
{
	System.out.println(s);
}

System.out.println("******Copied");
for(String s1:copiedList)

{
	System.out.println(s1);
}
	
	
	if(OriginalList.equals(copiedList))
	{
	   System.out.println("both are matching");
	}
	   
	    else
		
	  {
	    	System.out.println("not matching");
	
	    }

	Assert.assertTrue(OriginalList.equals(copiedList));
	}

}
