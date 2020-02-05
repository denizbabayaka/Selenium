package com.class08;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.class04.Constants;
import com.utils.CommonMethods;

public class WebTableTask2 extends CommonMethods {

	public static void main(String[] args) {
		 setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		 driver.findElement(By.linkText("Table")).click();
		 driver.findElement(By.linkText("Table Pagination")).click();
		 List<WebElement>elm=driver.findElements(By.xpath("//table[@class='table table-hover']/thead/tr/th"));
		System.out.println(elm.size());
		for(WebElement elm1:elm) {
			String str=elm1.getText();
			if(str.equals("Computer")) {
				System.out.println(str);
			}
		}
        
		Iterator<WebElement>it=elm.iterator();
		while(it.hasNext()) {
			String str=it.next().getText();
			System.out.println(str);
		}
		
	}

}
