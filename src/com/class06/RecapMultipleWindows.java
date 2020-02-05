package com.class06;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapMultipleWindows extends CommonMethods{

	public static void main(String[] args) {
		setUp("chrome", "http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modal-demo.html");
		driver.findElement(By.linkText("Follow On Instagram")).click();
		//1 getWindowHandles()
		//identify parent & child
		//switch
		
		//gets set of window is sessions and then put them into set
		Set<String>allWindows=driver.getWindowHandles();
		// and then get the iterator and grab them one by one 		                
		Iterator<String>stringIterator=allWindows.iterator();
		//grab the first element and then put in an String parent
		String parent=stringIterator.next();
		String child=stringIterator.next();
		// now we switch to child window and focus on the child we can do whatever we want 
		driver.switchTo().window(child);
		
		String childTitle=driver.getTitle();
		System.out.println(childTitle);
		
		// now we switch to child window and focus on the child we can do whatever we want 
		driver.switchTo().window(parent);
		String parentTitle=driver.getTitle();
		System.out.println(parentTitle);
		
		
		
		
		
		
		
	}

}
