Feature: Testing login functionality on adactin application 

Background: 
	Given the user to launch the browser
	Then user to launch application

Scenario Outline:
User checking the login function using  valid useername and valid password 
	Given user launch the application 
	When user enter valid username "<username>" in the username field 
	And user enter valid password "<password>" in password field 
	And user click on login button 
	Then user confirm it navigates to the homepage 
	
	Examples:
		|username|password|
		|rajraj1234@gmail.com|Sangeetha22|
	
Scenario: User search and selects the product 
	Given user search the product 
	When user select the product 
	And user modifies the product 
	And user add product to cart 
	Then user confirm the product added to card 
	
Scenario: User verifies the purchase details 
	Given user checkout the product 
	When user verifies the summary of the product 
	And user proceed to checkout the product 
	And user verifies the billing address 
	Then user proceed to payment option 
	
Scenario: User place the order 
	Given user accept the terms and condition 
	When user proceed to payment 
	And user select the mode of payment 
	And user confirm the order 
	Then user order is placed 
	
	
