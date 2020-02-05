package com.class03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> elmt=driver.findElements(By.tagName("a"));
		System.out.println("List of the links "+elmt.size());
		
		for(WebElement link:elmt) {
			String allLinks=link.getText();
			
			if(!allLinks.isEmpty()) {
				System.out.println(allLinks);
			}
		}

	}

}
