package SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constants;

public class Task3 extends CommonMethods {

	public static void main(String[] args) {
		// initializing the browser and URL
		setUp("chrome", Constants.SYNTAX_PRACTICE_URL);
		// creating a list of all links that begin with (<a)
		List<WebElement> elm = driver.findElements(By.tagName("a"));
		// printing out number of links
		int numLinks = elm.size();
		System.out.println(numLinks);
		// looping through links and associating them with their respective
		// href(hyperlink)

		for (WebElement elm1 : elm) {
			System.out.println(elm1.getText() + "=" + elm1.getAttribute("href"));
		}

		// close everything the driver opened
		// driver.close();
		// closing browser
		driver.quit();

	}

}
