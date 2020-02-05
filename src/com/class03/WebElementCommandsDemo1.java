package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommandsDemo1 {

	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login\n");
		driver.get(URL);
		//driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
		
		
		WebElement userName=driver.findElement(By.xpath("//input[@name='txtusername']"));
		userName.sendKeys("admin");
		userName.clear();//clears previous name to then add a new username
		userName.sendKeys("helen");
		driver.findElement(By.xpath("//[@name='txtPassword']")).sendKeys("helen@123");
		
		//span[@id='spanMessage']
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//Storing the error message element
		WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		//isDisplayed() ---> will return true or false
		System.out.println(errorMessage.isDisplayed());
		//stores the error message given by the application
		String errorMsg=errorMessage.getText(); //getText() ---> get visible text
		System.out.println(errorMsg);
		if(errorMessage.isDisplayed()) {//checking if the error message is displayed
			String message=errorMessage.getText();//get the visible text from error message
			if(message.equals("Invalid Credential")) {//compare the text with expected message
				System.out.println("Correct Error Message is Displayed");
			}else {
				System.err.println("Incorrect error message is displayed");
			}
		}
		
	}
}
