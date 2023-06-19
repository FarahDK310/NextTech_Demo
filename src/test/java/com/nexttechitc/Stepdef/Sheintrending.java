package com.nexttechitc.Stepdef;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nexttechitc.pageobjectmodel.SheintrendingPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sheintrending {

	WebDriver driver;
	
	@Given("^User visits shein homepage$")
	public void user_visits_shein_homepage() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://us.shein.com/");
	    Thread.sleep(4000);
		
	}

	@When("^user selects trending dropdown and clicks on women$")
	public void user_selects_trending_dropdown_and_clicks_on_women() throws Throwable {
	   
		
		Actions acts = new Actions (driver);
		SheintrendingPOM trends = new SheintrendingPOM (driver);
		
		acts.moveToElement(trends.Act_trending).build().perform();
		trends.Click_women.click();
			
		WebDriverWait Wait = new WebDriverWait (driver,20);
		
	}

	@Then("^user is redirected to trending womens page$")
	public void user_is_redirected_to_trending_womens_page() throws Throwable {
	    
		String Expectedurl = "https://us.shein.com/trends/Women-Clothing-SS23-sc-006114005.html?ici=us_tab01navbar03menu01dir02&src_module=topcat&src_tab_page_id=page_home1678900719458&src_identifier=fc%3DAll%60sc%3DTRENDING%60tc%3DSUMMER%202023%20COLLECTION%60oc%3DWomen%60ps%3Dtab01navbar03menu01dir02%60jc%3DitemPicking_006114005&srctype=category&userpath=category-TRENDING-Women";
		String Currenturl = driver.getCurrentUrl();
		
		Assert.assertEquals(Expectedurl, Currenturl);
		
	}


	
	
}
