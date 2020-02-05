package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class pageloadImmplicitWait extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome", "https://cnn.com");
		
		//page load waits until all elements on the page gets fully loaded 
		//if element wont load within 30 seconds you will get TimeOutException
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		//tell webdriver to wait for the element before throwing NoSuchelementException
		//we need implicit wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("wrongName")).sendKeys("iPhone");
		
		driver.quit();

	}

}
