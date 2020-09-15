package com.Dallas;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
import com.utils.Constants;

public class TaskWindowHandling extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);

		driver.findElement(By.linkText("Alerts & Modals")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Window Popup Modal")).click();

		String mainPageHandle = driver.getWindowHandle();

		driver.findElement(By.linkText("Follow On Instagram")).click();

		Set<String> handles = driver.getWindowHandles();
		
        int i=1;
		for (String handle : handles) {
			System.out.println("Window "+i+" : "+handle);
			i++;
		}
		
		Iterator<String>handleIt=handles.iterator();
		String window1=handleIt.next();
		String window2=handleIt.next();
		
		// we will switch to window2
		driver.switchTo().window(window2);
		
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		
		
		// driver.close(); will close main page not the instagram one 
		driver.close();

	}
}
