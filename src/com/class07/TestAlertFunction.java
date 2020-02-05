package com.class07;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TestAlertFunction extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/javascript-alert-box-demo.html");
		driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
		
		// this method which we created in Commonmethods will handle the alert element and
		// will return us a string
		String alertText=getAlertText();
		System.out.println(alertText);
	
		acceptAlert();
	
		Thread.sleep(3000);
		driver.quit();

	}

}
