package com.automation.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.automation.baseclass.BaseClass;
import com.automation.helper.FileReaderManager;
import com.automation.helper.PageObjectManager;
import com.automation.runner.Runner;
import com.pom.org.Login;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {

	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	
	public void beforeHooks(Scenario scenario) {
		String name=scenario.getName();
		System.out.println("Scenario name: "+name);
	}
	
	
	
	public void afterHooks(Scenario scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("Status: "+status);
		
		if(scenario.isFailed()) {
		screenshot(scenario, "C:\\Users\\kokil\\eclipse-workspace\\CucumberAutomation\\screenshot");	
			
		}
	}

	@Given("^the user to launch the browser$")
	public void the_user_to_launch_the_browser() throws Throwable {
	System.out.println("Launched browser");    
	}

	@Then("^user to launch application$")
	public void user_to_launch_application() throws Throwable {
	  System.out.println("Launched application");
	}

		
	// SCENARIO1
	@Given("user launch the application")
	public void user_launch_the_application() throws IOException, InterruptedException {
		String url = FileReaderManager.getInstance().getcrInstance().geturl();
		driver.get(url);
		Thread.sleep(3000);

		click(pom.getHp().getLogin());

	}
	
	@When("^user enter valid username \"([^\"]*)\" in the username field$")
	public void user_enter_valid_username_in_the_username_field(String arg1) throws Throwable {
		input(pom.getLp().getMail(), arg1);
		Thread.sleep(3000);
	}

	@When("^user enter valid password \"([^\"]*)\" in password field$")
	public void user_enter_valid_password_in_password_field(String arg1) throws Throwable {
		input(pom.getLp().getPass(), arg1);
		Thread.sleep(3000);
	    }


	
	

	/*
	 * @When("user enter valid username in the username field") public void
	 * user_enter_valid_username_in_the_username_field(String arg1) throws
	 * IOException, InterruptedException { input(pom.getLp().getMail(),arg1);
	 * Thread.sleep(3000);
	 * 
	 * }
	 * 
	 * @When("user enter valid password in password field") public void
	 * user_enter_valid_password_in_password_field(String arg1) throws
	 * InterruptedException { input(pom.getLp().getPass(), arg1);
	 * Thread.sleep(3000); }
	 */
	@When("user click on login button")
	public void user_click_on_login_button() {
		click(pom.getLp().getLog());
	}

	@Then("user confirm it navigates to the homepage")
	public void user_confirm_it_navigates_to_the_homepage() {
		System.out.println("Homepage displayed");

	}

	// SCENARIO 2

	@Given("^user search the product$")
	public void user_search_the_product() throws Throwable {
		action(pom.getIs().getWomen());
		click(pom.getIs().getTshirt());

	}

	@When("^user select the product$")
	public void user_select_the_product() throws Throwable {
		click(pom.getIs().getImgClick());
		switchframe();
		// driver.switchTo().frame(0);
		Thread.sleep(7000);

	}

	@When("^user modifies the product$")
	public void user_modifies_the_product() throws Throwable {
		click(pom.getIm().getImg());
		click(pom.getIm().getSize());
		click(pom.getIm().getColor());
		Thread.sleep(5000);
	}

	@When("^user add product to cart$")
	public void user_add_product_to_cart() throws Throwable {
		click(pom.getIm().getAdd());
		Thread.sleep(3000);
	}

	@Then("^user confirm the product added to card$")
	public void user_confirm_the_product_added_to_card() throws Throwable {
		System.out.println("Successfully added to cart");
		Thread.sleep(2000);

	}

	//SCENARIO3
	
	@Given("^user checkout the product$")
	public void user_checkout_the_product() throws Throwable {
		click(pom.getPo().getProceed1());
		Thread.sleep(3000);
		}

	@When("^user verifies the summary of the product$")
	public void user_verifies_the_summary_of_the_product() throws Throwable {
		System.out.println("Product is verified");
		Thread.sleep(2000);

		}

	@When("^user proceed to checkout the product$")
	public void user_proceed_to_checkout_the_product() throws Throwable {
		click(pom.getPo().getProceed2());
		Thread.sleep(2000);

		}

	@When("^user verifies the billing address$")
	public void user_verifies_the_billing_address() throws Throwable {
		System.out.println("Address verified");

		}

	@Then("^user proceed to payment option$")
	public void user_proceed_to_payment_option() throws Throwable {
		click(pom.getPo().getProceed3());
		Thread.sleep(2000);

		}

	//SCENARIO4
	
	@Given("^user accept the terms and condition$")
	public void user_accept_the_terms_and_condition() throws Throwable {
		click(pom.getPo().getProceed4());
		Thread.sleep(2000);

		}

	@When("^user proceed to payment$")
	public void user_proceed_to_payment() throws Throwable {
		click(pom.getPo().getProceed5());
		Thread.sleep(2000);

		}

	@When("^user select the mode of payment$")
	public void user_select_the_mode_of_payment() throws Throwable {
		click(pom.getPo().getProceed6());
		Thread.sleep(2000);

		}

	@When("^user confirm the order$")
	public void user_confirm_the_order() throws Throwable {
		click(pom.getPo().getProceed7());
		Thread.sleep(2000);

		}

	@Then("^user order is placed$")
	public void user_order_is_placed() throws Throwable {
		System.out.println("Order placed successfully");
		}

}
