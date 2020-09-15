package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task3Again extends CommonMethods {

	public static void main(String[] args) {
		 setUp("chrome", "https://the-internet.herokuapp.com/");
		 driver.findElement(By.linkText("Dynamic Controls")).click();
		 
		 WebElement elm=driver.findElement(By.xpath("//input[@type='text']"));
		 
		 boolean condition=elm.isEnabled();
		 
		 if(!condition) {
			 driver.findElement(By.xpath("//button[text()='Enable']")).click();
		 }
		 WebDriverWait wait=new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
		 
		 if(condition) {
			 elm.sendKeys("Hello");
			 String value=elm.getAttribute("value");
			 if(value.equals("Hello")) {
				 System.out.println("Succesfully entered text "+value);
			 }else {
				 System.out.println("Failed entered text");
			 }
		 }else {
			 System.out.println("Failed to enable textbox");
		 }
		 
				 driver.quit();
				 
		

	}

}
