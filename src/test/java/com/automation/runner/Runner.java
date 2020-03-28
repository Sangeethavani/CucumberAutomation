package  com.automation.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.baseclass.BaseClass;
import com.automation.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature", 
						glue="com\\adactin\\stepdefinition",
					plugin= {"pretty","html:Report",
								"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"},
						monochrome=true,
						dryRun=false,
						strict=false)

public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws IOException {
		String browserName = FileReaderManager.getInstance().getcrInstance().getBrowserName();
		driver=BaseClass.browserOpen(browserName);
		
	}

	
	@AfterClass
	public static void tearDown() {
	//	driver.close();

	}
	

}
