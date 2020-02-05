package com.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapAlert extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
		//by clicking the button an alert will pop up
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		// now the focus will be to the alert so we have to switch to the alert
		
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		// prints the text inside the alert
		System.out.println(alertText);
		// and accept the alerts
		alert.accept();
		
		Thread.sleep(1000);
		driver.quit();
		
		
		

	}

}
