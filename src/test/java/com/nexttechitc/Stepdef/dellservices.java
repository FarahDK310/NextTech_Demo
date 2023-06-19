package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.dellservicesPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellservices {

	WebDriver driver;
	
	@Given("^user visits dell homepage$")
	public void user_visits_dell_homepage() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.dell.com/en-us");
	    driver.manage().window().maximize();
	}

	@When("^user goes to services and clicks on support services$")
	public void user_goes_to_services_and_clicks_on_support_services() throws Throwable {
	    Actions acts = new Actions (driver);
	    dellservicesPOM serv = new dellservicesPOM (driver);
	    acts.moveToElement(serv.services()).build().perform();
		serv.support().click();
	}

	@Then("^user is redirected to support services page$")
	public void user_is_redirected_to_support_services_page() throws Throwable {
	    
	}

}
