package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[5]")).click();
		WebElement table=driver.findElement(By.id("product"));
		int rows=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println(rows);
		int columns=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println(columns);
		String text=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText();
		System.out.println(text);
		

	}

}
