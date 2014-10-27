package com.test.selenium;


import java.util.Iterator;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


/*
 * This class consists of all the reusable Selenium methods
 * 
 */


public class KeywordLibrary 
{
	
	WebDriver driver = null;

	public KeywordLibrary(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Method to clear data from field
	public void clearData(String locator, String obj, String data)
	{
		try
		{	
				driver.findElement(By.id(obj)).clear();
		}
		catch (NoSuchElementException e)
		{
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to enter data into text field
	public void setData(String obj, String data)
	{
		try
		{	
				driver.findElement(By.id(obj)).sendKeys(data);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to verify title
	public void assertTitle(String obj, String title)
	{
		try
		{
			String temp = "";
			temp = driver.getTitle();
			
			if (temp == title)
			{
				System.out.println("The title of the page: "+temp);
			}
			else
			{
				System.out.println("You are directed to wrong page...");
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to click a button
	public void clickButton(String obj)
	{
		try
		{	
				driver.findElement(By.id(obj)).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to select a check box
	public void SelectCheckBox(String obj)
	{
		try
		{	
				driver.findElement(By.id(obj)).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to select a radio button
	public void selectRadio(String obj)
	{
		try
		{	
				driver.findElement(By.id(obj)).click();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to select a item form dropdown
	public void selectItem(String obj, String option)
	{
		try
		{	
			
			Select value = new Select(driver.findElement(By.id(obj)));
			value.selectByVisibleText(option);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	//Method to accept alert
	public void acceptAlert()
	{
		try
		{
			Alert alert = driver.switchTo().alert();
			alert.accept();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	public void handleWindow(String childWindow)
	{
		try
		{
			//String parentWindowHandle = driver.getWindowHandle(); // save the current window handle.
		      WebDriver popup = null;
		      Iterator<String> windowIterator = (Iterator<String>) driver.getWindowHandles();
		      while(windowIterator.hasNext()) { 
		        String windowHandle = windowIterator.next(); 
		        popup = driver.switchTo().window(windowHandle);
		        if (popup.getTitle().equals("Google")) 
		        {
		          break;
		        }
		      }
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
	
	public void quit()
	{
		try
		{
			driver.quit();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}
	}
}
