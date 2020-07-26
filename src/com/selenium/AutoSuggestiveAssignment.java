package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestiveAssignment {

	public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("autocomplete")).click();

		driver.findElement(By.id("autocomplete")).sendKeys("ind");

		Thread.sleep(3000);

		/*
		 * int i=0;
		 * while(!driver.findElement(By.id("autocomplete")).getAttribute("value").
		 * contains("Indonesia")) { i++;
		 * driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN); if(i>10) {
		 * break; }
		 * 
		 * } System.out.println(driver.findElement(By.id("autocomplete")).getAttribute(
		 * "value"));
		 */
		
		
		
		  String text=driver.findElement(By.id("autocomplete")).getAttribute("value");
		  //System.out.println(text); 
		  int i = 0;
		  
		  
		  
		  while (!text.equalsIgnoreCase("Indonesia"))
		  
		  {
		  
		  i++;
		  
		  driver.findElement(By.id("autocomplete")).sendKeys(Keys.ARROW_DOWN);
		  text=driver.findElement(By.id("autocomplete")).getAttribute("value");
		
		  	
		  
		  if (i > 10)
		  
		  {
		  
		  break;
		  
		  }
		  
		  
		  }
		  System.out.println(text);

	}

}

