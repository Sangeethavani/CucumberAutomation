package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImgModify {
	public static WebDriver driver;

	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement img;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="color_14")
	private WebElement color;
	
	@FindBy(xpath="//button[@class='exclusive']")
	private WebElement add;
	
	public ImgModify(WebDriver driver2) {
		this.driver=driver2;
			PageFactory.initElements(driver, this);
		}


	public WebElement getImg() {
		return img;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAdd() {
		return add;
	}

}
