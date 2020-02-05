package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
//	Using Xpath ONLY
//	TC 1: Facebook login: 
//	Open chrome browser
//	Go to “https://www.facebook.com/”
//	Enter valid username and valid password and click login 
//	User successfully logged in
//	TC 2: Mercury Tours Registration: 
//	Open chrome browser
//	Go to “http://newtours.demoaut.com/”
//	Click on Register Link
//	Fill out all required info
//	Click Submit
//	User successfully registered
//	Collapse

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath(" //input[@type='email']")).sendKeys("deniz");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("babayaka");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		driver.close();
		
		

	}

}
