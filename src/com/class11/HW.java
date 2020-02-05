package com.class11;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.CommonMethods;

public class HW extends CommonMethods {

	public static void main(String[] args) {
		
		setUp("chrome", "http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload");
		driver.findElement(By.xpath("//input[@id='gwt-debug-cwFileUpload']")).sendKeys("C:\\Users\\deniz\\Pictures\\Saved Pictures");
		driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();
		String alertText=getAlertText();
		System.out.println(alertText);
		acceptAlert();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File("screenshots/gwtproject/upload") );
		} catch (IOException e) {
	
		

	}
		driver.quit();
	}
}
