package com.wbl.web;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Veggies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//
		
		
		
		//int j=0;
	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();
       String[] actualList= {"Beetroot","Tomato","Brocolli"};
	    
	
	   dr.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	  //  dr.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);)
	   
//dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

 WebDriverWait w=new WebDriverWait(dr,20);

addItems(dr,actualList);
	
	
	
	
	
	
	}


	
	public static void addItems(WebDriver dr,String[] actualList)
	{
		WebDriverWait w=new WebDriverWait(dr,20);


	List<WebElement> product=dr.findElements(By.cssSelector("h4.product-name"));
for(int i=0;i<product.size();i++)
{
	int j=0;
	
	String[] name=(product.get(i).getText().split("-"));
	String selectedName=name[0].trim();
	System.out.println(selectedName);
	
	
    List<String> item=Arrays.asList(actualList);
	
	
	if(item.contains(selectedName))
	{
		j++;
		
		//dr.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
		dr.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();;
	    if(j==actualList.length)

	    {
	    	break;
	    }
	}
	
}
       
dr.findElement(By.cssSelector("img[alt='Cart']")).click();

dr.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

//dr.findElement(By.xpath("//input[@class='pr$omoCode']")).sendKeys("rahushettyacademy");

w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='promoWrapper']/input")));



dr.findElement(By.xpath("//div[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");














dr.findElement(By.xpath("//button[@class='promoBtn']")).click();

w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));



System.out.println(dr.findElement(By.cssSelector("span.promoInfo")).getText());
	
	
	}

}
