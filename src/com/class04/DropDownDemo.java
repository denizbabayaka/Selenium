package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownDemo extends CommonMethods {
	
	public static final String SYNTAX_PRACTICE_URL = "http://166.62.36.207/syntaxpractice/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.linkText("Input Forms")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Select Dropdown List")).click();
		
		WebElement weekDropDown = driver.findElement(By.id("select-demo"));
		// We can use select class only if the DD tag starts with select tag
		Select select=new Select(weekDropDown);
		/*
		 * We can select values from a dd in 3 ways
		 * 1. by index
		 * 2.by visible text
		 * 3.by value attribute and you have the pass the value 
		 */
		// select by index
		select.selectByIndex(4);
		Thread.sleep(1000);
		// select by visible text
		select.selectByVisibleText("Tuesday");
		Thread.sleep(1000);
		// select by value 
		select.selectByValue("Friday");// pass the value of the value attribute 
		List<WebElement>option=select.getOptions();// this method gives the option of the dropdown
		System.out.println(option.size());
		
		System.out.println("Is this DD Multi Select= "+select.isMultiple());
		WebElement multiDD=driver.findElement(By.id("multi-select"));
		Select select2=new Select(multiDD);
		select2.selectByIndex(2);
		select2.selectByIndex(3);
		select2.selectByIndex(4);
		select2.deselectByIndex(4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
