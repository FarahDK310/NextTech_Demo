package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Twobrowsers {

	WebDriver driver;
	
	@Given("^User goes to Shein homepage on Chrome browser and edge browser$")
	public void user_goes_to_Shein_homepage_on_Chrome_browser_and_edge_browser() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\faraw\\Downloads\\edgedriver_win64\\msedgedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://us.shein.com/");
	  driver=new EdgeDriver();
	  driver.get("https://us.shein.com/");
	  }

	@When("^User clicks on Kids tab on chrome browser and on edge browser$")
	public void user_clicks_on_Kids_tab_on_chrome_browser_and_on_edge_browser() throws Throwable {
	    
	}

	@Then("^User is redirected to kids collection on chrome and edge$")
	public void user_is_redirected_to_kids_collection_on_chrome_and_edge() throws Throwable {
	    
	}
}
