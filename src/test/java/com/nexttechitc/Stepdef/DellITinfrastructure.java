package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.pageobjectmodel.DellITinfrastructurePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DellITinfrastructure {

	WebDriver driver;
	
	@Given("^User visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\faraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.dell.com/en-us");
	  driver.manage().window().maximize();
	  
	}

	@When("^User to go to IT infrastructure drop down menu and able to see products$")
	public void user_to_go_to_IT_infrastructure_drop_down_menu_and_able_to_see_products() throws Throwable {
	  Actions act = new Actions (driver);
	  DellITinfrastructurePOM infra = new DellITinfrastructurePOM(driver);
	  act.moveToElement(infra.infrastructure()).build().perform();
	  infra.developers().click();
	  act.moveToElement(infra.services()).build().perform();
	  infra.support().click();
	}

}
