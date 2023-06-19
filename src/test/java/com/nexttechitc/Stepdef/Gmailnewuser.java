package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmailnewuser {

	WebDriver driver;
	
	@Given("^User visits gmail homepage$")
	public void user_visits_gmail_homepage() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://accounts.google.com/");
	    
	}

	@When("^User clicks on new user tab$")
	public void user_clicks_on_new_user_tab() throws Throwable {
	    
	}

	@Then("^User is directed to new user creation page$")
	public void user_is_directed_to_new_user_creation_page() throws Throwable {
	   
	}


}
