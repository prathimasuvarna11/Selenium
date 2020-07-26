package com.selenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver,5);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String[] itemsNeeded = {"Brocolli", "Cucumber", "Beetroot", "Carrot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		addItems(driver,itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}
		
		public static void addItems(WebDriver driver, String[] itemsNeeded)
		{
			int j=0;
			List<WebElement> items =driver.findElements(By.cssSelector("h4.product-name"));
			for(int i=0;i<items.size();i++)
			{
				String[] names=items.get(i).getText().split("-");
				String formattedNames=names[0].trim();
				List<String> itemsNeededList=Arrays.asList(itemsNeeded);
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
