package com.wbl.web;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
		System.setProperty("chrome.driver.webdriver","C:\\neeru\\workspace\\webdriver2019\\chromedriver.exe");

		WebDriver dr=new ChromeDriver();
        dr.get("https://jqueryui.com/droppable/");
    System.out.println(dr.findElements(By.tagName("iframe")).size());
    
    dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    
    dr.switchTo().frame(dr.findElement(By.cssSelector("iframe[class='demo-frame']")));
     dr.findElement(By.cssSelector("#draggable")).click();
     
    System.out.println( dr.findElement(By.cssSelector("#draggable")).getText());
     
	Actions a=new Actions(dr);
	
	
	WebElement source=dr.findElement(By.cssSelector("#draggable"));
	WebElement target=dr.findElement(By.id("droppable"));
	
	//System.out.println(dr.findElement(By.cssSelector("div.ui-widget-header.ui-droppable.ui-state-highlight")).getText());
	a.dragAndDrop(source,target).build().perform();
	
	
	}
}