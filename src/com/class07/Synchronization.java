package com.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Synchronization extends CommonMethods{

	public static void main(String[] args) {
	
		setUp("chrome", "https://www.google.com/");
		//conditional 
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Gmail")).click();
    
    	
    	
    	
    

	}

}
