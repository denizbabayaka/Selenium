package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

/*
 * navigate to "https://the-internet.herokuapp.com/upload"
 * upload the file 
 * verify file is uploaded
 */

public class Fileupload extends CommonMethods {
	public static void main(String[] args) {
		setUp("chrome", "https://the-internet.herokuapp.com/upload");
		//to upload file we can use sendKeys method and provide full path to the file
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\deniz\\Pictures\\Saved Pictures\\");
		//clicking on upload button
		driver.findElement(By.id("file-submit")).click();
		//verify element File Upload is displayed
		WebElement uploaded= driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
		if(uploaded.isDisplayed()) {
			System.out.println("File succesfully uploaded");
		}else {
			System.out.println("File is not uploaded");
		}
		driver.quit();
		
	}

}
