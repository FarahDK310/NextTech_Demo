package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellITinfrastructurePOM {
	
WebDriver driver;
public DellITinfrastructurePOM (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/button/span")
    WebElement act_infrastructure;
    public WebElement infrastructure (){
    return act_infrastructure;
    }

    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[7]/a")
    WebElement click_developers;
    public WebElement developers (){
    return click_developers;
    }

    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
    WebElement act_services;
    public WebElement services() {
    	return act_services;
    }
    
    @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[7]/a")
    WebElement click_supportserv;
    public WebElement support () {
    	return click_supportserv;
    }
}
