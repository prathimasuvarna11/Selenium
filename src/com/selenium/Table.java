package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<count-2;i++)
		{
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int IntegerValue=Integer.parseInt(value);
			sum=sum+IntegerValue;
			
			
		}
		String extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int IntegerExtra=Integer.parseInt(extra);
		int TotalSum=sum+IntegerExtra;
		System.out.println(TotalSum);
		
		String total=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotal=Integer.parseInt(total);
		if(ActualTotal==TotalSum)
		{
			System.out.println("Count matches");
		}
		else
		{
			System.out.println("Count fails");
		}
	


	}

}
