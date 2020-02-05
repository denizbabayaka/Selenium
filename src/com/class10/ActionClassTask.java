package com.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class ActionClassTask extends CommonMethods {

	public static void main(String[] args) {
		  setUp("chrome", "https://jqueryui.com/droppable/");
		  //since there is frame we have use switchToFrame method
		  WebElement dragFrame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		  switchToFrame(dragFrame);
		  WebElement drag=driver.findElement(By.id("draggable"));
		  WebElement dragto=driver.findElement(By.id("droppable"));
		  Actions act=new Actions(driver);
		  act.dragAndDrop(drag, dragto).perform();
		  
		  if(dragto.getText().equals("Dropped!")) {
			  System.out.println("Passed");
		  }else {
			  System.out.println("Failed");
		  }
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		
			File screen=ts.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(screen, new File("screenshots/jqueryui/DragAndDrop.png") );
			} catch (IOException e) {
				
				e.printStackTrace();
 
	}
			driver.close();
	}
}
