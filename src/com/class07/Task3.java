package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task3 extends CommonMethods {
	
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Controls” link
//	Click on enable button
//	Enter “Hello” and verify text is entered successfully
//	Close the browser

	public static void main(String[] args) {
	
		setUp("chrome", "https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[text()='Dynamic Controls']")).click();
		WebElement element=driver.findElement(By.xpath("//button[text()='Enable']"));
		element.click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Disable']")));
		
		WebElement element1=driver.findElement(By.xpath("//input[@type='text']"));
		element1.sendKeys("Hello");
		boolean isDisplayed=element1.isDisplayed();
		
		if(isDisplayed) {
			System.out.println("TestCase Passed");
		}else {
			System.out.println("Test case failed");
		}
		
	
		
		driver.quit();
         
	}

}
