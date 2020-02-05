package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class04.Constants;
import com.utils.CommonMethods;

public class RecapRadioAndCheck extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUp("chrome", "https://www.toolsqa.com/automation-practice-form/");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		// it will not give an error but will gonna click on the first element
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//handle group of radio or checkbox by putting them on a List type of WebElement
		List <WebElement> checkBoxes=driver.findElements(By.xpath("//input[@name='tool']"));
		
		// and then put them in loop which has a Web Element type of variable and check them one by one 
		for(WebElement boxes:checkBoxes) {
			
			// this will get the value of boxes which assigned to a String variable
			String str=boxes.getAttribute("value");
			//System.out.println("Text froma checkbox-----"+str);
			
			// we put a if statement to check specific value
			if(str.equals("Selenium IDE")) {
				boxes.click();
				break;
			}
			
			
			
		
		}
		
		
		
		Thread.sleep(2000);	
		
		driver.quit();
		
	}

}
