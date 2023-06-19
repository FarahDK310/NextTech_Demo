package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {

	WebDriver driver;
	
	@Given("^User visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
		
	}

	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
	    
		AmazonsearchPOM Asearch = new AmazonsearchPOM(driver);
		Asearch.Amazonsearch().sendKeys(arg1);
		Asearch.searchicon().click();
		
	}

	@Then("^user should be able to see the expected products$")
	public void user_should_be_able_to_see_the_expected_products() throws Throwable {
	   
	}


	
}
