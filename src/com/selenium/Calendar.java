package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			System.out.println(driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText());
			driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		}
		List<WebElement> dates= driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td"));
		int count=driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td")).get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("28"))
			{
				driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td")).get(i).click();
				break;
			}
		}

	}

}
