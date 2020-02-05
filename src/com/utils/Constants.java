package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Constants {

	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static final String SYNTAX_PRACTICE_URL="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	 
//	 
//	TakesScreenshot ts = (TakesScreenshot) driver;
//	// call method getScreenshotAs and specify output type
//	File screen = ts.getScreenshotAs(OutputType.FILE);
//	try {
//		// copy file to the specified destination and give name and extension
//		FileUtils.copyFile(screen, new File("C:\Users\deniz\eclipse-workspace\Selenium\screenshots"));
//	} catch (IOException e) {
//		e.printStackTrace();
//	}
}
