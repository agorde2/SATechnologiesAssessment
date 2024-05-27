package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import base.Base;

public class Page_Home extends Base{

	String homeLogo ="//a[contains(@class,'logo')]";
	String topMenuOurStory ="//a[contains(@class,'menu-item') and contains(text(),'Our Story')]";
	String topMenuOurSolution="//a[contains(@class,'menu-item') and contains(text(),'Our Solution')]";
	String topMenuWhyTendable="//a[contains(@class,'menu-item') and contains(text(),'Why Tendable?')]";
	String topMenuAboutUs="//a[contains(@class,'menu-item') and contains(text(),'About Us')]";	
	String requestDemo="//a[contains(text(),'Request A Demo')]";
	String WhatIstendableHeader="//h2[contains(text(),'What is Tendable?')]";
	String OurOriginalStoryHeader="//h2[contains(text(),'Our Origin Story')]";
	String WhyTendableHeader="//h2[contains(text(),'Why should you')]";
	
	
	
    
	
	public void validateTopMenuItemsAccessibility()
	{
		findElement(homeLogo).isDisplayed();
		findElement(homeLogo).isEnabled();
		findElement(topMenuOurStory).isDisplayed();
		findElement(topMenuOurStory).isEnabled();
		findElement(topMenuOurSolution).isDisplayed();
		findElement(topMenuOurSolution).isEnabled();
		findElement(topMenuWhyTendable).isDisplayed();
		findElement(topMenuWhyTendable).isEnabled();
		
		
	}
	
	public void validateRequestADemoOnAllPages()
	{
		findElement(homeLogo).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(WhatIstendableHeader)));
		Assert1.assertTrue(findElement(requestDemo).isEnabled(), "Request A Demo is not Present on Home Page");
		
		findElement(topMenuOurStory).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(OurOriginalStoryHeader)));
		Assert1.assertTrue(findElement(requestDemo).isEnabled(), "Request A Demo is not Present on Our Story Page");
		
		findElement(topMenuOurSolution).click();
		Assert1.assertTrue(findElement(requestDemo).isEnabled(), "Request A Demo is not Present on Our Solution Page");
		
		findElement(topMenuWhyTendable).click();
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(WhyTendableHeader)));
		Assert1.assertTrue(findElement(requestDemo).isEnabled(), "Request A Demo is not Present on Why Tendable Page");
		
			
	}
	
}


