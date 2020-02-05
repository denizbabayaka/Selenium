package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", "https://www.ebay.com/");
		// find the select type element and put it in a variable which is type of WebElement
		WebElement dd=driver.findElement(By.cssSelector("select#gh-cat"));
		
		// and then call the Select class and create an object and pass the varible of WebElemet type
		Select obj=new Select(dd);
		// get the options of element and put store them in a list
		List<WebElement>options=obj.getOptions();
		// validate each option is clickable
//		for(WebElement option:options) {
//			option.click();
//			Thread.sleep(1000);
//		}
		// validate user can select "Music"option
		obj.selectByVisibleText("music");
		boolean isSelected=false;
		for(WebElement option:options) {
			String text=option.getText();
			if(text.equals("Music")) {
				obj.selectByVisibleText(text);
				isSelected=true;
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.quit();
	}
}
