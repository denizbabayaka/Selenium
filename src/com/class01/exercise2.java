package com.class01;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class exercise2 extends CommonMethods{
	public static void main(String[] args) throws InterruptedException {
		
		setUp("Chrome", "https://twitter.com/?lang=en");
		
		//switchToFrame("ape_Gateway_right-2_desktop_iframe");
		driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
		
		driver.findElement(By.xpath(" //input[@name='session[username_or_email]'and @type='text']")).sendKeys("Deniz");
		
		driver.findElement(By.xpath("//input[@name='session[password]'and @type='password']")).sendKeys("Babayaka");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
	
		
	   
	
		
		
		
	

   
	}

	}


