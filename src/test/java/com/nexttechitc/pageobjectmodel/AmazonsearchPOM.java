package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {

	WebDriver driver;
	
	//create constructor
	public  AmazonsearchPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	     }
	
	//create web elements and declare the method of the web elements
	@FindBy(name="field-keywords")
	  
	   WebElement Type_amazonsearch;
	     
	   public WebElement Amazonsearch(){
	   return Type_amazonsearch;
	    
	   }
	   
	   @FindBy(id="nav-search-submit-button")
	   
	   WebElement Click_searchicon;
	     
	   public WebElement searchicon(){
	   return Click_searchicon;

	    }

}
