package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.nexttechitc.pageobjectmodel.canvabusinessPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class canvabusiness {

	WebDriver driver;
	
	@Given("^User visits canva homepage$")
	public void user_visits_canva_homepage() throws Throwable {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.canva.com/");
	 driver.manage().window().maximize();
		Thread.sleep(4000);
		
	}

	@When("^User selects business dropdown and clicks on marketing$")
	public void user_selects_business_dropdown_and_clicks_on_marketing() throws Throwable {
	    
		Actions acts = new Actions (driver);
		canvabusinessPOM canva = new canvabusinessPOM (driver);
		
		acts.moveToElement(canva.act_business).build().perform();
		canva.click_marketing.click();
	}

	@Then("^user is redirected to canva business marketing page$")
	public void user_is_redirected_to_canva_business_marketing_page() throws Throwable {
	    
		String Expectedurl = "https://www.canva.com/solutions/marketing/";
		String Currenturl = driver.getCurrentUrl();
		
		Assert.assertEquals(Expectedurl, Currenturl);
		
	}


	
}
