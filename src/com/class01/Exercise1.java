package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("Facebook-Log In or Sign Up")) {
			System.out.println("Login page title ok");
		}else {
			System.err.println("Login page title does not match expactation");
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.linkText("Forgot account?")).click();
		
		if(driver.getTitle().equals("Forgot Password |Can't Log In|Facebook")){
			
		System.out.println("Forgot account page title ok");
		}else {
			System.err.println("Forgot account page title does not match");
			System.out.println(driver.getTitle());
		}
		driver.navigate().back();
		driver.navigate().refresh();
		
		if(driver.getTitle().equals("Facebook-Log In or Sign Up")) {
			System.out.println("Login page title ok after renavigating");
		}else {
			System.err.println("Login page title does not match expactations");
			System.out.println(driver.getTitle());
		}
		
		
		
		
		
		

	}

}
