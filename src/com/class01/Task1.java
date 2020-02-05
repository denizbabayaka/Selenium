package com.class01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://syntaxtechs.com");
	Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		String actualTitle=driver.getTitle();
		String expectedTitle="https://www.facebook.com/";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		driver.close();
		System.out.println("Actual Title is:"+actualTitle);
		
	
		
		
	
		
	

	}

}
