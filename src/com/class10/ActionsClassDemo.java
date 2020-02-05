package com.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.class04.Constants;
import com.utils.CommonMethods;

/*
 * navigate to HRMS application
 * enter uid and pwd
 * click on login using mouse
 */


public class ActionsClassDemo extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
		
		//to perform mouse or keyboard operation we need to have an object on the Action class 
		//we call the action class and pass our driver as a parameter
		Actions act=new Actions(driver);
		//identify an element on which to perform a mouse click
		WebElement loginButton=driver.findElement(By.cssSelector("input#btnLogin"));
		
		// by the act method we call the moveToElement method and pass the variable of WebElement type loginButton
		Thread.sleep(3000);
		
		//clicking on the mouse and to complete the action we need to call perform(); method
		act.moveToElement(loginButton).click().perform();
		// to perfom double click
		//act.moveToElement(loginButton).doubleClick().perform();
		
		//do right click
		//act.moveToElement(loginButton).contextClick().perform();
		Thread.sleep(5000);
		//hover over the element
		WebElement pimLnk=driver.findElement(By.linkText("PIM"));
		act.moveToElement(pimLnk).perform();
		 //click on the AddEmployee link using action class                 		                 
		WebElement clk=driver.findElement(By.id("menu_pim_addEmployee"));
		//act.moveToElement(clk).click().perform();
		act.click(clk).perform();
		
		//act.keyUp(Keys.SHIFT).sendKeys("hello")-->if you perform this on txt box 
		// it will hold shift key and type hello in upper case
		
		Thread.sleep(5000);
		driver.quit();
	
		

	}

}
