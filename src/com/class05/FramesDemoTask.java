package com.class05;

import org.openqa.selenium.By;

import com.utils.CommonMethods;
//TC 1: Syntax Frame verification
//Open chrome browser
//Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//Click on “Others” link
//Click on “Iframe” link
//Click on the “Home” link inside the 1 frame
//Verify “Syntax logo” is displayed in another frame
//Quit browser


public class FramesDemoTask extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		
		//The method is opening syntax Practice website using chrome browser
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		//Click on “Others” link
		driver.findElement(By.linkText("Others")).click();	
		driver.findElement(By.linkText("Iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
	    driver.findElement(By.xpath("navbar-brand navbar-brand-centered")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(2);
	    boolean textDis=driver.findElement(By.xpath("//h2[text()='IFrame practice']")).isDisplayed();
	    System.out.println(textDis);
		
		
	
		
		
		
	}
}
