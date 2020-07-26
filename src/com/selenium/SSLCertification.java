package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertification {

	public static void main(String[] args) {
		DesiredCapabilities dp = DesiredCapabilities.chrome();
		dp.acceptInsecureCerts();
		dp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		dp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions ch = new ChromeOptions();
		ch.merge(dp);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NI7587\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(ch);

	

}

}
