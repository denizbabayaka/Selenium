package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task2 extends CommonMethods {
	
//	Open chrome browser
//	Go to “https://the-internet.herokuapp.com/”
//	Click on “Click on the “Dynamic Controls” link
//	Select checkbox and click Remove
//	Click on Add button and verify “It’s back!” text is displayed
//	Close the browser 

	public static void main(String[] args) {
		
		setUp("chrome", "https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		WebElement element=driver.findElement(By.xpath("//input[@type='checkbox']"));
		element.click();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']"))).click();
		boolean isDisplayed=driver.findElement(By.id("message")).isDisplayed();
		WebElement elm=driver.findElement(By.id("message"));
		String str=elm.getText();
		
		if(isDisplayed) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		System.out.println(str);
		driver.quit();

	}

}
