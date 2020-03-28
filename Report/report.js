$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing login functionality on adactin application",
  "description": "",
  "id": "testing-login-functionality-on-adactin-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User checking the login function using  valid useername and valid password",
  "description": "",
  "id": "testing-login-functionality-on-adactin-application;user-checking-the-login-function-using--valid-useername-and-valid-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid username in the username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter valid password in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user confirm it navigates to the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_application()"
});
formatter.result({
  "duration": 17445860900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_in_the_username_field()"
});
formatter.result({
  "duration": 344250100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_password_in_password_field()"
});
formatter.result({
  "duration": 256888500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_login_button()"
});
formatter.result({
  "duration": 2791514400,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirm_it_navigates_to_the_homepage()"
});
formatter.result({
  "duration": 154000,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User search and selects the product",
  "description": "",
  "id": "testing-login-functionality-on-adactin-application;user-search-and-selects-the-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user search the product",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "user select the product",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user modifies the product",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user add product to cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user confirm the product added to card",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_search_the_product()"
});
formatter.result({
  "duration": 4897483100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_product()"
});
formatter.result({
  "duration": 7237893000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_modifies_the_product()"
});
formatter.result({
  "duration": 5705584300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_add_product_to_cart()"
});
formatter.result({
  "duration": 3224926200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirm_the_product_added_to_card()"
});
formatter.result({
  "duration": 2004476200,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User verifies the purchase details",
  "description": "",
  "id": "testing-login-functionality-on-adactin-application;user-verifies-the-purchase-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user checkout the product",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user verifies the summary of the product",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user proceed to checkout the product",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user verifies the billing address",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user proceed to payment option",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_checkout_the_product()"
});
formatter.result({
  "duration": 5938731800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_summary_of_the_product()"
});
formatter.result({
  "duration": 2008647900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_proceed_to_checkout_the_product()"
});
formatter.result({
  "duration": 3925297800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_verifies_the_billing_address()"
});
formatter.result({
  "duration": 124100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_proceed_to_payment_option()"
});
formatter.result({
  "duration": 4342666500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User place the order",
  "description": "",
  "id": "testing-login-functionality-on-adactin-application;user-place-the-order",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "user accept the terms and condition",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user proceed to payment",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user select the mode of payment",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user confirm the order",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user order is placed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_accept_the_terms_and_condition()"
});
formatter.result({
  "duration": 2136753900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_proceed_to_payment()"
});
formatter.result({
  "duration": 4204160800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_mode_of_payment()"
});
formatter.result({
  "duration": 3361407800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_confirm_the_order()"
});
formatter.result({
  "duration": 4732036700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_order_is_placed()"
});
formatter.result({
  "duration": 1003000,
  "status": "passed"
});
});