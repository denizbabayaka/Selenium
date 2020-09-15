package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\\n");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");;
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Syntax@123");;
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']"));
		if(logo.isDisplayed()) {
			System.out.println("TC pass");
		}else {
			System.out.println("TC Fail");
		
		}
			
		driver.close();
			
			
		
			

	}

}
