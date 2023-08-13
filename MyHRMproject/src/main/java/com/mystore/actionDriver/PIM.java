package com.mystore.actionDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.base.BaseClass;

public class PIM extends BaseClass{
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")
    WebElement EmpName;
	
	@FindBy(xpath="//*[@class=\"oxd-input oxd-input--active\"]")
	WebElement id;
	
	@FindBy(xpath="//*[@type=\"submit\"]")
	WebElement submitPIM;
	
	public PIM() {
		PageFactory.initElements(driver,this);
	}
	
	
}
