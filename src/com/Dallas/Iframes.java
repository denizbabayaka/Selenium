package com.Dallas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Iframes extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Others")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Iframe")).click();

		driver.switchTo().frame("FrameOne");

		driver.findElement(By.linkText("Home")).click();

		// if we want to switch to main page we use this method

		driver.switchTo().defaultContent();

		// Again switch to another frame

		driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));

		driver.switchTo().frame("FrameTwo");

		WebElement logo = driver.findElement(By.xpath("//img[@class='custom-logo']"));

		boolean isLogoDisplayed = logo.isDisplayed();

		if (isLogoDisplayed) {

			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");
		}

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@class='enroll-btn']")).click();
		
	

		driver.quit();
	}

}
