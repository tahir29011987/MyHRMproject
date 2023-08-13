package com.mystore.testcases;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.json.JsonException;
import java.lang.reflect.InvocationTargetException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mysore.pageobject.IndexPage;
import com.mystore.actionDriver.HomePage;
import com.mystore.actionDriver.LoginPage;
import com.mystore.actionDriver.PIM;
import com.mystore.base.BaseClass;

public class LoginPage_Test extends BaseClass {
	IndexPage index;
	LoginPage login;
	HomePage homePage;
	PIM Pim;
	 @BeforeMethod
		public void setup() {
			loadConfig();
		 //launchApp();
		}
	 @AfterTest
	 public void tearDown() {
		 driver.quit();
	 }
	
	 @Test
	private void clickLg() {
		 
		index=new IndexPage();
		login=new LoginPage();
		homePage=new HomePage();
		 homePage=login.clickLogin(prop.getProperty("username"),prop.getProperty("password"));
		 Pim=new PIM();
		//homePage=login.clickLogin(prop.getProperty("username"),prop.getProperty("password"));
		//String actUrl=homePage.getCurrentUrl();
		//String ExpUrl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		//Assert.assertEquals(actUrl,ExpUrl);
		Pim=homePage.validate_PIM();
		 System.out.println("PIM OPEN Sucessfully");
		  }
	 
}
