package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// Line 13 and 15 codes does not give severe err code
		
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY	,"true");
		
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		//system is a class setProperty(); is a static method
		//                    Key                       Value
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();//WebDriver is an interface and we create an object of chrome driver 
		//http---> hyper text transfer protocol 
		driver.get("https://www.google.com");  // keeps the browser history
		Thread.sleep(2000);// it will wait 2 sec. after getting google
		
		//browser navigation commands
		
		//it will navigate to a given url after google 
		driver.navigate().to("http://www.facebook.com");
		//it will navigate back to google
		driver.navigate().back();
		// it will navigate one step forward to facebook
		driver.navigate().forward();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);// it will bring the title of facebook
		
		driver.close();
		//driver.quit();
		
		
		
		
		
		

	}

}
