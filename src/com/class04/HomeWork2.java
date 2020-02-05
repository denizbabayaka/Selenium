package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HomeWork2 extends CommonMethods {
	public static final String SYNTAX_PRACTICE_URL = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
//	1.Open chrome browser
//	2.Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html”
//		3.Click on “Input Forms” links
//		4.Click on “Radio Buttons Demo” links
//		5.Click on any radio button in “Radio Button Demo” section.
//		6.Verify correct radio is clicked
//		7.Click on any radio button in “Group Radio Buttons Demo” section.
//		8.Verify correct checkbox is clicked9.Quit browser
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", SYNTAX_PRACTICE_URL);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		WebElement radioButton=driver.findElement(By.xpath("//input[@name='optradio' and @value='Male']"));
		System.out.println(radioButton.isSelected());
		radioButton.click();
		
		List<WebElement>radioButtons=driver.findElements(By.cssSelector("input.cb1-element"));
		for(int i=0;i<radioButtons.size();i++) {
			if(!radioButtons.get(i).isSelected()&&radioButtons.get(i).isEnabled()) {
				radioButtons.get(i).click();
				System.out.println("Is option number "+(i+1)+" is selected-->"+radioButtons.get(i).isSelected());
			}
		}
	Thread.sleep(3000);
driver.close();		
	

	}

}
