package com.class07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class WebTableHandle extends CommonMethods {

	public static void main(String[] args) {
		
		setUp("chrome", "https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int rowCount=rows.size();
		System.out.println("Total rows in web table :"+rowCount);
		
		String beforeXpath="//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath="]/td[1]";
		
		for(int i=2;i<=rowCount;i++) {
			String actualXpath=beforeXpath+i+afterXpath;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			if(element.getText().equals("Island Trading")){
				System.out.println("company name :"+element.getText()+" is found "+" at position :"+i);
				break;
			}
			
		}
		System.out.println("*****************");
		
		
		//*[@id="customers"]/tbody/tr[2]/td[2]
		String afterXpathContact="]/td[2]";
		for(int i=2;i<=rowCount;i++) {
			String actualXpath=beforeXpath+i+afterXpathContact;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			}
		System.out.println("*****************");
		
		
		//*[@id="customers"]/tbody/tr[2]/td[3]
		String afterXpathCompany="]/td[3]";
		for(int i=2;i<=rowCount;i++) {
			String actualXpath=beforeXpath+i+afterXpathCompany;
			WebElement element=driver.findElement(By.xpath(actualXpath));
			System.out.println(element.getText());
			
			}
			driver.quit();
		}
       
	}


