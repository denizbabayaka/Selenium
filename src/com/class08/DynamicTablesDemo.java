package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DynamicTablesDemo extends CommonMethods {
	/*
	 * Navigate to the WebOrders
	 * login into Weborders
	 * click checkbox next to Bob Feather
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		
		//search for Bob Feather
				String expectedValue="Bob Feather";
				
				//once we find the element of the table then store it into a List which is type of WebElement
				List<WebElement> rows=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
				//then we loop it through all of the rows 
				for(int i=1; i<rows.size(); i++) {
					//get the text and put them into String 
					String rowText=rows.get(i-1).getText();
					//System.out.println(rowText);
					//and put condition for the expected value 
					if(rowText.contains(expectedValue)) {
						driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+i+"]/td[1]")).click();
					}
				}

				Thread.sleep(4000);
				driver.quit();
	

	}

}
