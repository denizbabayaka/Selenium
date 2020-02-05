package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
//	TC 1: Amazon Page Title Verification: 
//		Open chrome browser
//		Go to “https://www.amazon.com/”
//		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//		TC 2: Syntax Page URL Verification: 
//		Open chrome browser
//		Navigate to “https://www.syntaxtechs.com/”
//		Navigate to “https://www.google.com/”
//		Navigate back to Syntax Technologies Page
//		Refresh current page
//		Verify url contains “Syntax”


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		String str=driver.getTitle();
		System.out.println(str);
		//driver.close();
		
		driver.get("https://www.syntaxtechs.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		String actualtitle=driver.getCurrentUrl();
		System.out.println(actualtitle);
		//System.out.println(actualtitle);
		String expectedTitle="https://syntaxtechs.com/";
		System.out.println(actualtitle.equals(expectedTitle)?"PASSED":"FAILED");
		driver.close();
			
		
		
		
		
		
	

	}

}
