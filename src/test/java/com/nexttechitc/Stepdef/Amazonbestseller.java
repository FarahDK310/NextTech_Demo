package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.bestsellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {

	WebDriver driver;
	
	@Given("^User to go to Amazon homepage$")
	public void user_to_go_to_Amazon_homepage() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("https://www.amazon.com/");
	   //how to maximize the window
	   driver.manage().window().maximize();	   
	}

	@When("^User clicks on bestseller tab$")
	public void user_clicks_on_bestseller_tab() throws Throwable {
		//create an object 
		bestsellerPOM bestseller=new bestsellerPOM(driver);
		//objectname.import methodPOM
        bestseller.bestseller().click();
	}

	@Then("^User is redirected to Amazon bestseller page$")
	public void user_is_redirected_to_Amazon_bestseller_page() throws Throwable {
	    
	}


	
}
