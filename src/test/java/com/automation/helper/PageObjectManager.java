package com.automation.helper;

import org.openqa.selenium.WebDriver;

import com.pom.org.HomePage;
import com.pom.org.ImageSelect;
import com.pom.org.ImgModify;
import com.pom.org.Login;
import com.pom.org.PlaceOrder;

public class PageObjectManager {

	public static WebDriver driver;

	public static HomePage hp;
	public static Login lp;
	public static ImageSelect is;
	public static ImgModify im;
	public static PlaceOrder po;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;

	}

	public static WebDriver getDriver() {

		return driver;
	}

	public static ImageSelect getIs() {
		is = new ImageSelect(driver);
		return is;
	}

	public static ImgModify getIm() {
		im = new ImgModify(driver);
		return im;
	}

	public static PlaceOrder getPo() {
		po = new PlaceOrder(driver);
		return po;
	}

	public static HomePage getHp() {
		hp = new HomePage(driver);
		return hp;
	}

	public static Login getLp() {
		lp = new Login(driver);
		return lp;
	}

}
