package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButtonsPractice extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		CommonMethods.setUp("chrome", SYNTAX_PRACTICE_URL);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement maleRadioButton=driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
		maleRadioButton.click();
		Thread.sleep(1000);
		boolean isselect=maleRadioButton.isSelected();
		System.out.println("is male button selected: "+isselect);
		driver.close();

	}

}
