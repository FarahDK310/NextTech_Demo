package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.pageobjectmodel.FacebooknewaccountPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooknewaccount {
	
	WebDriver driver;
	
	@Given("^user to go to facebook new account homepage$")
	public void user_to_go_to_facebook_new_account_homepage() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/signup");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@When("^user types \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_types_and_and_and_and(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		FacebooknewaccountPOM fbnewaccount = new FacebooknewaccountPOM(driver);
		fbnewaccount.firstname().sendKeys(arg1);
		fbnewaccount.surname().sendKeys(arg2);
		fbnewaccount.emailaddress().sendKeys(arg3);
		fbnewaccount.confirmemail().sendKeys(arg4);
		fbnewaccount.password().sendKeys(arg5);
	}

	@When("^user selects birth date and gender and clicks sign up$")
	public void user_selects_birth_date_and_gender_and_clicks_sign_up() throws Throwable {
		FacebooknewaccountPOM fbselect = new FacebooknewaccountPOM (driver);
		Select dropdown = new Select (fbselect.select_day);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		Select dropdown1 = new Select (fbselect.select_month);
		dropdown1.selectByValue("10");
		Thread.sleep(3000);
		Select dropdown2 = new Select (fbselect.select_year);
		dropdown2.selectByVisibleText("1981");
		Thread.sleep(3000);
		fbselect.select_gender().click();
	}

	@Then("^user is redirected to profile page$")
	public void user_is_redirected_to_profile_page() throws Throwable {
	    
	}

	
	
	    
	}




	



