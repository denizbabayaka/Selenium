package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dallas1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://google.com");

		String title = driver.getTitle();

		System.out.println("Title is " + title);

		if (title.equals("Google")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current uf "+currentUrl);
		
		

		// close the current browser
		driver.close();
		// terminate the driver object
		// driver.quit();

	}

}
