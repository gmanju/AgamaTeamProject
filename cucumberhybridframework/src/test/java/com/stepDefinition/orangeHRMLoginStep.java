package com.stepDefinition;


import java.io.IOException;

import com.baseclass.Library;
import com.pages.OHRMprojectLogin;
import com.seleniumutils.seleniumutils;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class orangeHRMLoginStep extends Library {
	seleniumutils utils;
	OHRMprojectLogin login;
	@Given("^launch the browser and enter the url$")
	public void launch_the_browser_and_enter_the_url() throws IOException  {
	 launchApplication();   
	}

	@When("^login page is opened$")
	public void login_page_is_opened()  {
	    utils=new seleniumutils(driver);
	    utils.getTitle();
	   utils.sreenshot("src\\test\\resources\\Screenshots\\login.png");
	    
	    
	}

	@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_the_and(String username, String password)  {
		login=new OHRMprojectLogin(driver); 
		login.login(username, password);
	}

	@Then("^click the login button$")
	public void click_the_login_button() {
	    
	}





}
