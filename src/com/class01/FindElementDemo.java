package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * functional testing automation tools:QTP/UFT,Selenium,SoapUi
		 * non functional testing automation tools :loadRunner,jmeter
		 * Advantages of Selenium webDriver:
		 * open source tool
		 * work on any browser (Chrome,Firefox,IE,Safari,Opera...)
		 * support many prog Lng:java,Phyton,Ruby,C#,JS
		 * platform independent :Windows,Mac,Linux
		 */
		
		  
		 
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\n");
		
	    driver.findElement(By.id("txtUsername")).sendKeys("admin");//Locator method By.id();
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
