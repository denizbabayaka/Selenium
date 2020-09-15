package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sohilaryan");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("alyan");
	}

}

        //input[@type='text']

		//form[starts-with(@action,'/humanresource')]

		//h1[text()='A place where knowledge becomes a career']

		//h1[contains(text(),'Syntax')]

		//input[@type='hidden' and @name='actionID']

		//input[@type='hidden' or @name='actionID']

        // / html/body/div/div/a[2] absolute xpath starts with one / and starts from html top root 



