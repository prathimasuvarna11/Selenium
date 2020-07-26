package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveWithAjax {

	public static void main(String[] args) {
		int i=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("beng");
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
		/*
		 * while(!driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText()
		 * .contains("KUNIGAL")) {
		 * driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.
		 * DOWN); break; }
		 */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script="return document.getElementById('fromPlaceName').value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		while(!text.equalsIgnoreCase("Bengaluru Internation Airport"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			
			if(i>10)
			{
				break;
			}
		}
		if(i>10)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found");
		}

	
}
}