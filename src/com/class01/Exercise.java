package com.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//http-->hypertext transfer protocol
		driver.get("http://google.com");
		String name1 = "Alper Aslan";
		String search = "Dallas DFW";
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys(name1);
		element.clear();
		element.sendKeys("Galatasaray");
		element.clear();
		element.sendKeys(search);
		element  = driver.findElement(By.name("btnK"));
		element.click();
		String title  = driver.getTitle();
		if(title.contains(search)) {
			System.out.println("\n\n\n\n===========\nTEST PASSED\n===========\n\n\n\n\n");
		}else{
			System.out.println("TEST FAILED");
		}
		System.out.println(title.contains(search)?"PASSED":"FAILED");
		
		driver.quit();

	}

}
