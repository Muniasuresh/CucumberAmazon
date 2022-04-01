package com.cts.automation.stepdef;

import com.cts.automation.LoginPage.LoginPage;
import com.cts.automation.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonStepDef extends BaseClass {
	
	@Given("user launches chrome")
	public void user_launches_chrome() {
		
		launchChrome();
		driver.get("https://www.amazon.in/");
	
	   
	}
	

	@Then("login should be successful")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	

@When("user enters Search as {string}")
public void user_enters_Search_as(String searchTxt) {
    LoginPage Obj = new LoginPage();
    Obj.login(searchTxt);
}

@Given("user lanches chrome and navigates to url")
public void user_lanches_chrome_and_navigates_to_url() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}



}
