package com.class11;
/*
 * navigate to google and search for specific item
 */


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class Recap extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 11 pro",Keys.ESCAPE);
		
		Actions act=new Actions(driver);
		WebElement button=driver.findElement(By.name("btnK"));
		//act.moveToElement(button).click().perform();
		//2.way
		act.click(button).perform();
		Thread.sleep(3000);
		driver.quit();
		
	}

}
