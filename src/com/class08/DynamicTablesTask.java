package com.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

import net.bytebuddy.asm.Advice.Return;

public class DynamicTablesTask extends CommonMethods {

	// public static void main(String[] args) throws InterruptedException {

	static String rowText1 = "";

	public static String DynamicTable() {

		setUp("chrome", "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		// search for Bob Feather
		String expectedValue = "Susan McLaren";

		// while handling Webtables we store them data into a list because List allow
		// duplicates and maintain the insertion order

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
		for (int i = 1; i < rows.size(); i++) {
			String rowText = rows.get(i - 1).getText();
			// System.out.println(rowText);
			if (rowText.contains(expectedValue)) {
				driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[" + i + "]/td[13]"))
						.click();
				break;
			}
		}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id, 'txtName')]")));
		driver.findElement(By.xpath("//input[contains(@id, 'txtName')]")).clear();
		driver.findElement(By.xpath("//input[contains(@id, 'txtName')]")).sendKeys("Susan Sarandon");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']")).clear();
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox6']"))
				.sendKeys("5550032258874559");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")).clear();
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']")).sendKeys("12/24");
		Thread.sleep(2000);

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();

		rows.clear();
		rows = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr"));

		for (int i = 1; i < rows.size(); i++) {
			Thread.sleep(2000);
			String rowText = rows.get(i - 1).getText();
			if (rowText1.contains("Susan Sarandon")) {
				Thread.sleep(2000);
				System.out.println("Table updated.Test case passed");
				System.out.println(rowText1);
				break;
			}
		}

		return rowText1;

	}

}
