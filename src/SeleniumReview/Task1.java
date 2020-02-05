package SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {
		
		setUp("chrome", Constants.HRMS_URL);
//		driver.findElement(By.partialLinkText("Check")).click();
//		driver.navigate().back();
//		driver.findElement(By.linkText("Hovers")).click();
		WebElement elemt=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
		elemt.click();
		if(elemt.isSelected()) {
			System.out.println("Check box 1 was selected");
		}else {
			System.out.println("Check box 1 was  not selected - please re run");
		}

		
		
	

	}

}
