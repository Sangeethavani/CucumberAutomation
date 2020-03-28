package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImageSelect {
	public static WebDriver driver;

	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement Women;
	
	@FindBy(xpath="//a[@title='T-shirts']")
	private WebElement Tshirt;
	
	@FindBy(xpath="//a[@class='product_img_link']")
	private WebElement ImgClick;
	
	public ImageSelect(WebDriver driver2) {
		this.driver=driver2;
			PageFactory.initElements(driver, this);
		}


	public WebElement getWomen() {
		return Women;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}

	public WebElement getImgClick() {
		return ImgClick;
	}

}
