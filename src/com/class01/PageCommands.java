package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//WebDriver is an interface 
		
		driver.get("http:google.com");
		
		final String expectedTitle="google";
		String actulaTitle=driver.getTitle();
		
		if(expectedTitle.equals(actulaTitle)) {
			System.out.println("The actual and expected Title match");
		}else {
			System.err.println("The actual and expected Title did not match");
		}
		
		
		driver.close();
	}

}
