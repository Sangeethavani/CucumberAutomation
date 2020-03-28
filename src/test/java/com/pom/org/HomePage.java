package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement login;

	public HomePage(WebDriver driver2) {
	this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
}	

