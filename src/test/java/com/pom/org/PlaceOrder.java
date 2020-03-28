package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {

	public static WebDriver driver;

	public PlaceOrder(WebDriver driver2) {
		this.driver=driver2;
			PageFactory.initElements(driver, this);
		}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getProceed1() {
		return proceed1;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getProceed5() {
		return proceed5;
	}

	public WebElement getProceed6() {
		return proceed6;
	}

	public WebElement getProceed7() {
		return proceed7;
	}
	
	

	@FindBy(xpath="//a[@class='btn btn-default button button-medium']")
	private WebElement proceed1;
	
	
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
	private WebElement proceed2;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed3;
	
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement proceed4;
	
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed5;

	
	@FindBy(xpath="//a[@class='cheque']")
	private WebElement proceed6;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement proceed7;
	
	
}
