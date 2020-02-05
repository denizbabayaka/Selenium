package com.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Task4 extends CommonMethods {
	/*
	 * TC 1: Add Employee
	Open chrome browser
	Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
	Login into the application
	Add Employee
	Log out 
	Quit the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName"))).sendKeys("Deniz");
		driver.findElement(By.id("middleName")).sendKeys("***");
		driver.findElement(By.id("lastName")).sendKeys("Babayaka");
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys("123984");
		
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(1000);
		driver.quit();

	}

}
