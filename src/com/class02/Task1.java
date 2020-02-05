package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//TC 2: Mercury Tours Registration: 
//Open chrome browser
//Go to “http://newtours.demoaut.com/”
//Click on Register Link
//Fill out all required info
//Click Submit
//User successfully registered
//(Create 2 scripts using different locators)


public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Deniz");
		driver.findElement(By.name("lastName")).sendKeys("Babayaka");
		driver.findElement(By.name("phone")).sendKeys("123457");
		driver.findElement(By.id("email")).sendKeys("Deniz@yahoo.com");
		driver.findElement(By.name("city")).sendKeys("Chantilly");
		driver.findElement(By.name("state")).sendKeys("Virginia");
		driver.findElement(By.name("postalCode")).sendKeys("20707");
		driver.findElement(By.id("")).sendKeys("Deniz@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Deniz");
		driver.findElement(By.name("confirmPassword")).sendKeys("Deniz");
		driver.findElement(By.name("register")).click();
		
		String url=driver.getCurrentUrl();
		if(url.equals("http://newtours.demoaut.com/mercuryregister.php?osCsid=5b8f2448238e8d7467a81f65bfeeb894")){
			System.out.println("User Passed");
		
		} else
		 {
			System.out.println("User Failed");
		}
		
			
	}

}
