package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebooknewaccountPOM {

	WebDriver driver;
	//Create constructor
	public FacebooknewaccountPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//define elements
	@FindBy(name="firstname")
	WebElement type_firstname;
	public WebElement firstname() {
		return type_firstname;
	}
	@FindBy(name="lastname")
	WebElement type_surname;
	public WebElement surname() {
	return type_surname;
	}
    @FindBy(name="reg_email__")
    WebElement type_emailaddress;
    public WebElement emailaddress() {
    	return type_emailaddress;
    }
	@FindBy(name="reg_email_confirmation__")
	WebElement type_confirmemail;
	public WebElement confirmemail() {
		return type_confirmemail;
	}
	@FindBy(xpath="//*[@id=\"password_step_input\"]")
	WebElement type_password;
	public WebElement password() {
		return type_password;
	}
	@FindBy(name="birthday_day")
	public WebElement select_day;
	
	@FindBy(name="birthday_month")
	public WebElement select_month;
	
	@FindBy(xpath="//*[@id=\"year\"]")
	public WebElement select_year;
	
	@FindBy(name="sex")
	WebElement click_female;
	public WebElement select_gender() {
	 return click_female;
}
}

