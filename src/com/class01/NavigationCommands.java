package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		final String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("The  actual and  expected Title matched");
		}else{
			System.out.println("The actual and expected Title did not match");
		}
		
		System.out.println("**************************");
		
		
		
		String expectedUrl="https://www.google.com/?gws_rd=ssl";
		String actualUrl=driver.getCurrentUrl();// brings the title of the website and assign to a varible type String
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL matched");
		}else {
			System.out.println("Actual and expected did not match");
		}
		
		
		driver.close();

	}

}
