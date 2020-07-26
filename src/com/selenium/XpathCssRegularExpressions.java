package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCssRegularExpressions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//a[contains(@title,'wSign in')]")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("username");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("password");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		//driver.findElement(By.xpath("//input[contains(@title,'Sign')]")).click();
		driver.close();
		

	}

}
