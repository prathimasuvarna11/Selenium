package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		Assert.assertFalse(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).click();	
		Assert.assertTrue(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		System.out.println(driver.findElement(By.name("ctl00$mainContent$chk_IndArm")).isSelected());
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 6);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}
