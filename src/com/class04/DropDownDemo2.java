package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods ;

public class DropDownDemo2 extends CommonMethods{
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();//Input Forms</a> definition of element 
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Select Dropdown List")).click();
		//dropdown is a list of options that type of a list in an element 
		WebElement weekDropDown = driver.findElement(By.id("select-demo"));
		// We can use select class only if the DD tag starts with select tag
		Select select=new Select(weekDropDown);
		
		//Returns the list of all options present in the drop down 
		List<WebElement>option=select.getOptions();
		String str=option.toString();
		
		System.out.println("Size of the DD is "+option.size());
		
		for(WebElement element:option) {
			// getting the text of elements and assign them to a String variable 
		     String ddValue=element.getText();
		     System.out.println(ddValue);
		     if(ddValue.equals("Friday")) {
		    	 element.click();
		     }
				     
		}
	     Thread.sleep(1000);
	     driver.close();
	}
}
