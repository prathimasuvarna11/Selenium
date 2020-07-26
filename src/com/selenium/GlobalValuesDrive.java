package com.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\NI7587\\eclipse-workspace\\Selenium\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		FileOutputStream fos = new FileOutputStream("C:\\Users\\NI7587\\eclipse-workspace\\Selenium\\data.properties");
		prop.store(fos, null);

	}

}
