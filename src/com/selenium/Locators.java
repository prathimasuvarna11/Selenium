package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		  driver.findElement(By.id("email")).sendKeys("enter username");
		  driver.findElement(By.name("pass")).sendKeys("enter password");
		  driver.findElement(By.linkText("Forgotten account?")).click();
		  driver.close();
		 
		

	}

}
