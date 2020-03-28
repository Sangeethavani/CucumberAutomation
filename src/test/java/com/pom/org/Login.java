package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	
	public static WebDriver driver;

	@FindBy(id="email")
	private WebElement mail;
	
	@FindBy(id="passwd")
	private WebElement pass;

	@FindBy(id="SubmitLogin")
	private WebElement log;
	
	public Login(WebDriver driver2) {
		this.driver=driver2;
			PageFactory.initElements(driver2, this);
		}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Login.driver = driver;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}
		

	
	
	
}
