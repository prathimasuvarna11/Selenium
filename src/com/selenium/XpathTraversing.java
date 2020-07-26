package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTraversing {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='a4bIc']/input")).sendKeys("google");
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		driver.close();

	}

}
