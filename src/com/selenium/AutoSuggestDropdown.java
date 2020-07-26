package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//div[@class='fsw_inner ']/div/div/div/div/div/input")).sendKeys("Mumb");
		driver.findElement(By.className("calc60")).click();
		
		  Thread.sleep(2000); 
		  driver.findElement(By.xpath("//div[@class='fsw_inner ']/div[2]/div/div/div/div/input")).sendKeys("Beng"); 
		  driver.findElement(By.className("calc60")).click();
		  //driver.findElement(By.xpath("//div[@class='fsw_inner ']/div/div/div/div/div/input")).sendKeys(Keys.ENTER);
		  
		 
	}

}
