package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class formMethods {

public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

//Is displayed is used when particular object is in code base but it is in visible mode or not

driver.get("http://www.makemytrip.com/");

System.out.println(" Before clikcing on Multi city Radio button");

System.out.println(driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']")).isDisplayed());

//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();

//driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).isEnabled();

System.out.println(" After clikcing on Multi city Radio button");

driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[3]")).click();

driver.findElement(By.xpath("//div[@data-cy='flightTraveller']")).click();

int i=0;

while(i<5)

{

driver.findElement(By.xpath("//div[@class='travellers']/div/ul")).click();


i++;

}
driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();

//System.out.println(driver.findElement(By.xpath(".//*[@id='return_date_sec']")).isDisplayed());

//System.out.println(driver.findElement(By.xpath(".//*[@id='mui_city_button']/span")).isDisplayed());

Thread.sleep(3000L);

//System.out.println(driver.findElement(By.xpath(".//*[@id='responsive_bottom']/div[2]/div[1]/div/div/h3")).getText());

//If you want to validate the object which is present in web page or code base

int count=driver.findElements(By.xpath(".//*[@id='multi_city_button']/span")).size();

if (count==0)

{

System.out.println("verified");

}

//

}

}