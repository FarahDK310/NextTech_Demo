package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SheintrendingPOM {

	public SheintrendingPOM (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/nav/div[3]/a/div")
	public WebElement Act_trending;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[1]/div/div[2]/div[1]/div/div[1]/nav/div[3]/nav/div[2]/div[1]/div[2]/p/a")
	public WebElement Click_women;
	
}
