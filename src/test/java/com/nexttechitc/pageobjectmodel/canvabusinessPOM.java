package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class canvabusinessPOM {

	public canvabusinessPOM (WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"__a11yId3\"]")
	public WebElement act_business;
	
	@FindBy(xpath="//*[@id=\"__a11yId5\"]/div/div/div/div/div[1]/ul/li[2]/ul/li[1]/a/div")
	public WebElement click_marketing;
	
	
}
