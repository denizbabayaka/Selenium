package com.class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;
  
//TC 1: JavaScript alert text verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Alerts & Modals” links
//Click on “Javascript Alerts” links
//Click on button in “Java Script Alert Box” section
//Verify alert box with text “I am an alert box!” is present
//Click on button in “Java Script Confirm Box” section
//Verify alert box with text “Press a button!” is present
//Click on button in “Java Script Alert Box” section
//Enter text in the alert box
//Quit browser


public class AlertDemoTask extends CommonMethods{

	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		
		//The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.xpath("//a[@href='#' and text()='Alerts & Modals']")).click();
		driver.findElement(By.linkText("Javascript Alerts")).click();
		driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		String str=alert.getText();
		if(str.equals("I am an alert box!")) {
			System.out.println("Alert box code is confirmed");
		}else {
			System.out.println("Alex box code is in correct");
		}
		alert.accept();
		
	
		
		driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']")).click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert();
		String str1=alert1.getText();
		if(str1.equals("Press a button!")) {
			System.out.println("Alert box code is confirmed");
		}else {
			System.out.println("Alex box code is in correct");
		}
		alert.accept();
	     
		driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
		Alert alert2=driver.switchTo().alert();
		alert2.sendKeys("Sending keys");
		alert2.accept();
		//driver.close();
		
		
		
		

	}

}
