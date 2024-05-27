package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.Base;

public class Page_ContactUs extends Base {


	String contactUs="//a[contains(text(),'Contact Us')]";
	String buttonContactMarketing="//div[contains(text(),'Marketing')]/..//button[contains(text(),'Contact')]";
	String textBoxName="//input[contains(@id,'form-input-fullName')]";
	String textOrganizationName="//input[contains(@id,'form-input-organisationName')]";
	String textBoxCellPhone="//input[contains(@id,'form-input-cellPhone')]";
	String textBoxEmail="//input[contains(@id,'form-input-email')]";
	String radioButtonIAgree="//input[contains(@id,'form-input-consentAgreed')]";
	String requiredErrorForMessage="//textarea[contains(@id,'form-input-message')]/..//li[contains(text(),'This field is required')]";
	String buttonSubmit="//button[contains(text(),'Submit')]";
	
	public void navigateToMarketingEnquiryPage()
	{
		findElement(contactUs).click();		
		findElement(buttonContactMarketing).click();
		
	}
	
	public void FillDetailsOnFormAndSubmit()
	{
		findElement(textBoxName).sendKeys("Abhijit G");
		findElement(textOrganizationName).sendKeys("Awesome Technologies");
		findElement(textBoxCellPhone).sendKeys("9999999999");
		findElement(textBoxEmail).sendKeys("a@g.com");
		findElement(radioButtonIAgree).click();
		findElement(buttonSubmit).click();
		Assert1.assertTrue(findElement(requiredErrorForMessage).isDisplayed(), "Not getting error Msg when Message field is empty");
	}

}

