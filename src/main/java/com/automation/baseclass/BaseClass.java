package com.automation.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserOpen(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\kokil\\eclipse-workspace\\SeleniumConcept\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\kokil\\eclipse-workspace\\SeleniumConcept\\Drivers\\IE driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else {
				System.out.println("Invalid browser");
			}
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return driver;
	}

	public static WebDriver geturl(String url) {
		driver.get(url);
		return driver;
	}
	
	public static void input(WebElement element ,String str) {
		element.sendKeys(str);
	}
	
	public static void click(WebElement element) {
    element.click();
	}
	
	public static void navigateto(String url1) {
		driver.navigate().to(url1);
	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void action(WebElement element1) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).perform();

	}
	
	public static void switchframe() {
		driver.switchTo().frame(0);
		
	}
	
	}
	
	
	
	
	
	
	
	
	

