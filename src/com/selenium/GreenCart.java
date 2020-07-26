package com.selenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenCart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded= {"Brocolli","Cucumber","Beetroot","Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,itemsNeeded);

	}
	
	public static void addItems(WebDriver driver,String[] itemsNeeded)
	{
		int j=0;
		List<WebElement> items=driver.findElements(By.cssSelector("h4[class='product-name']"));
		for(int i=0;i<items.size();i++)
		{
			String[] names=items.get(i).getText().split("-");
			String formattedNames=names[0].trim();
			List<String >itemsNeededList=Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedNames))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}
				
			}
		}
	}

}
