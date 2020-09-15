package SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task2 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("chrome", com.class04.Constants.HRMS_URL);
		
		
		
		
		WebElement ss = driver.findElement(By.partialLinkText("Checkboxes"));
		//clicking on checkbox
		ss.click();
		WebElement gg =driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]"));
		System.out.println(gg.isEnabled());
		driver.navigate().back();
		WebElement gg1 = driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]"));
		System.out.println(gg1.isSelected());
		driver.quit();
		

	}

}
