package SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.utils.CommonMethods;
import com.utils.Constants;

public class Locating extends CommonMethods {

	public static void main(String[] args) {

		setUp("chrome", Constants.HRMS_URL);
		driver.findElement(By.partialLinkText("Check")).click();
		driver.findElement(By.linkText("Dropdown")).click();

	}

}
