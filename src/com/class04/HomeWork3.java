package com.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;
//TC 1: Amazon Department List Verification1.Open chrome browser
//2.Go to “http://amazon.com/”
//	3.Verify how many department options available.●Print each department ●Select Computers
//	4.Quit browser

public class HomeWork3 extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", "https://www.amazon.com/");
		WebElement depart = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select depts = new Select(depart);
		List<WebElement> depOptions = depts.getOptions();
		System.out.println("there are " + depOptions.size() + " departments in total");

		for (WebElement op : depOptions) {
			System.out.println(op.getText());
		}

	}

}
