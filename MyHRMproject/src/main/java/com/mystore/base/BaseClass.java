package com.mystore.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import com.mystore.actionDriver.Action;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
    public static Properties prop;
    public static WebDriver driver;
    
   
	public void loadConfig() {
		try {
			prop=new Properties();
			System.out.println("Super constrctor called");
			//FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"/Config1.Properties/Config.Properties");
		 //  InputStream ip=new FileInputStream("C:\\Users\\Shahadab Khan\\eclipse-workspace\\MyHRMproject\\Config1.Properties\\Config.Properties");
			InputStream ip=new FileInputStream("C:\\Users\\Shahadab Khan\\eclipse-workspace\\MyHRMproject\\src\\main\\java\\ConfigProperties\\Config.Properties");
			prop.load(ip);
		    System.out.println("driver:"+driver);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebDriverManager.chromedriver().setup();
		String broserName=prop.getProperty("browser");
    	if(broserName.contains("Chrome")) {
    	driver= new ChromeDriver();
    	
    	driver.get(prop.getProperty("url"));
    	Action.implicitWait(driver,30);
    	Action.pageLoadTimeOut(driver,50);
    	
    	}
	
	}
    /*public static void launchApp() {
    	/*WebDriverManager.chromedriver().setup();
    	String broserName=prop.getProperty("browser");
    	if(broserName.contains("Chrome")) {
    		driver= new ChromeDriver();
    	}else if(broserName.contains("FireFox")) { 
    		driver= new FirefoxDriver();
    	}else if(broserName.contains("IE")) {
    		driver=new InternetExplorerDriver();
    	}*/
    	/*String broserName=prop.getProperty("browser");
    	if(broserName.contains("Chrome")) {
    	driver= new ChromeDriver();*/
    	   	
    	
   
    }

