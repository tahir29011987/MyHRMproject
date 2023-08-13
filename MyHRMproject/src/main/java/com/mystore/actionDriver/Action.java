package com.mystore.actionDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import com.mystore.base.BaseClass;

public class Action extends BaseClass{
	
	
	public static void scorllByVisibilityofElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true );",ele);
			}
   public static void click(WebDriver ldriver,WebElement loatorName)
   {
	   Actions act=new Actions(ldriver);
	   act.moveToElement(loatorName).click().build().perform();
   }
   public static boolean findElement(WebDriver ldriver,WebElement ele)
   {
	   boolean flag=false;
	   try {
		   ele.isDisplayed();
		   flag=false;}
	   catch(Exception e) {
		   flag=false;
	   }finally {
		   if(flag) {
			   System.out.println("Succesfully found elemenet at");
		   }else {
			 System.out.println("Unable to locate elemenent at");
		   }
	   }
	   return flag;
	   }
   public static boolean isDispyed(WebDriver ldriver,WebElement ele)
   {
	   boolean flag=false;
	   flag=findElement(ldriver,ele);
		if(flag) {
			flag=ele.isDisplayed();
	   if(flag) {
		System.out.println("the element is displayed:");
		} else {
			System.out.println("The element is not displayed:");
			}
	   }else {
		   System.out.println("Not displayed");
	   }
	   return flag;
		}
   public static boolean isSelected(WebDriver ldriver,WebElement ele) {
	   boolean flag=false;
	   flag=findElement(ldriver,ele);
	   if(flag) {
			flag=ele.isSelected();
	   if(flag) {
		System.out.println("the element is selected:");
		} else {
			System.out.println("The element is not selected:");
			}
	   }else {
		   System.out.println("Not selected");
	   }
	   return flag;
		}
   public static boolean isEnabled(WebDriver ldriver,WebElement ele) {
	   boolean flag=false;
	   flag=findElement(ldriver,ele);
	   if(flag) {
			flag=ele.isEnabled();
	   if(flag) {
		System.out.println("the element is Enabled:");
		} else {
			System.out.println("The element is not Enabled:");
			}
	   }else {
		   System.out.println("Not Enabled");
	   }
	   return flag;
		}
   public static boolean type(WebElement ele,String text) {
	   boolean flag=false;
	   try {
		   flag=ele.isDisplayed();
				   ele.clear();
				   ele.sendKeys(text);
				   flag=true;
	   }catch(Exception e) {
		   System.out.println("Location not found");
		   flag=false;
	   }finally {
		   if(flag) {
				System.out.println("Successfully entered value:");
				} else {
					System.out.println("Unable to enter value:");
					}
	   }
	   return flag;
		   
   }
   public static boolean selectBySendKeys(WebElement ele,String value) {
	   boolean flag=false;
	   try {
		   ele.sendKeys(value);
		   flag=true;
		   return true;
	   }catch(Exception e) {
		   return false;
	   }finally {
		   if(flag) {
			   System.out.println("Select value from dropdown:");
		   }else {
			   System.out.println("Not select value from dropdown:");
		   }
	   }
   }
   public static boolean selectByIndex(WebElement element,int index) {
	   boolean flag=false;
	   try {
		  
		   Select s=new Select(element);
		   s.selectByIndex(index);
		   flag=true;
		   return true;
	   }catch(Exception e) {
		   return false;
	   }finally {
		   if(flag) {
			   System.out.println("Option selected by Index:");
		   }else {
			   System.out.println("Option not selected by Index:");
		   }
	   }
   }
   public static boolean selectByValue(WebElement element,String value) {
	   boolean flag=false;
	   try {
		  
		   Select s=new Select(element);
		   s.selectByValue(value);
		   flag=true;
		   return true;
	   }catch(Exception e) {
		   return false;
	   }finally {
		   if(flag) {
			   System.out.println("Option selected by value:");
		   }else {
			   System.out.println("Option not selected by value:");
		   }
	   }
   }
   public static boolean selectByVisible(String visibletext,WebElement ele) {
	   boolean flag=false;
	   try {
		  
		   Select s=new Select(ele);
		   s.selectByValue(visibletext);
		   flag=true;
		   return true;
	   }catch(Exception e) {
		   return false;
	   }finally {
		   if(flag) {
			   System.out.println("Option selected by visibletText:");
		   }else {
			   System.out.println("Option selected by visibletText:");
		   }
	   }
   }
   public static boolean JSClick(WebElement driver,WebElement ele) {
	   boolean flag=false;
	   try {
		   JavascriptExecutor executor=(JavascriptExecutor)driver;
		   executor.executeScript("arguments[0].click();",ele);
		   flag=true;
		   }
	   catch(Exception e) {
		   throw e;
	   }finally {
		   if(flag) {
			   System.out.println("Click action is performed:");
		   }else if(!flag) {
			   System.out.println("Click action is not performed:");
		   }
	   }
	   return flag;
   }
  /* public static boolean swithtoFrameByIndex(int index)throws Throwable{
	   boolean flag=false;
	   try {
		   new WebDriverWait(driver,15).until(ExceptedConditions.visibilty)
		   driver.switchTo().frame(index);
		   flag=true;
		   return true;
		   
	   }catch(Exception e){
       if(flag) {
    	   System.out.println("Frame with index\" "+index);
       }else {
    	   System.out.println("Frame with not index\" "+index);
       }
	   }
	   
   }*/
   public static boolean swithtoFrameById(String idvalue)throws Throwable{
	   boolean flag=false;
	   try {
		   driver.switchTo().frame(idvalue);
		   flag=true;
		   return true;
	   }catch(Exception e){
	       e.printStackTrace();
	       return false;
	       }finally{
	    	   if(flag) {
	        	   System.out.println("Frame with id\" "+idvalue);
	           }else {
	        	   System.out.println("Frame with not id\" "+idvalue);
	           }
	    	  
	       }
	   }
   public static boolean swithtoFrameByName(String nameValue)throws Throwable{
	   boolean flag=false;
	   try {
		   driver.switchTo().frame(nameValue);
		   flag=true;
		   return true;
	   }catch(Exception e){
	     
	       return false;
	       }finally{
	    	   if(flag) {
	        	   System.out.println("Frame with name\" "+nameValue);
	           }else {
	        	   System.out.println("Frame with not name\" "+nameValue);
	           }
	    	  
	       }
	   }
   public static boolean swithtoDefaultFrame()throws Throwable{
	   boolean flag=false;
	   try {
		   driver.switchTo().defaultContent();
		   flag=true;
		   return true;
	   }catch(Exception e){
	     
	       return false;
	       }finally{
	    	   if(flag) {
	        	   System.out.println("Frame with name:");
	           }else {
	        	   System.out.println("Frame with not name:");
	           }
	    	  
	       }
	   }
   public static boolean mouseOverElement(WebElement element)throws Throwable{
	   boolean flag=false;
	   try {
		   new Actions(driver).moveToElement(element).build().perform();
		   flag=true;
	   }catch(Exception e){
		   e.printStackTrace();
	   }finally {
		   if(flag) {
			   System.out.println("MouseDriver Action is performed on");
			   		   }else {
			   			   System.out.println("MouseDriver Action is not performed on");
			   		   }
		   
		   
	   }
	return flag;
   }
public static void implicitWait(WebDriver driver, int i) {
	
	// TODO Auto-generated method stub
	
}
public static void pageLoadTimeOut(WebDriver driver, int i) {
	// TODO Auto-generated method stub
	
}
   
   
}
