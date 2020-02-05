package com.class04;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;
//1.Open chrome browser
//2.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//3.Click on “Input Forms” links
//4.Click on “Simple Form Demo”
//5.Get all input boxes from the page
//6.Enter “Hello” to each text box
//7.Close browser

public class HomeWork1 extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Simple Form Demo")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("user-message")).sendKeys("Hello");
		driver.findElement(By.id("sum1")).sendKeys("Hello");
		driver.findElement(By.id("sum2")).sendKeys("Hello");
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	

	}

}
