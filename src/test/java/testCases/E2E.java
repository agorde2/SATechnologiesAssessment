package testCases;

import org.testng.annotations.Test;
import pages.Page_ContactUs;
import pages.Page_Home;
import base.Runner;

public class E2E extends Runner {
	
	Page_Home home=new Page_Home();
	Page_ContactUs contactUs= new Page_ContactUs();
	
	
	@Test
	public void E2EAssessment()
	{
		test = extent.createTest("Test Case 1", "The test case 1 has passed");
		home.validateTopMenuItemsAccessibility(); 
		home.validateRequestADemoOnAllPages();
		contactUs.navigateToMarketingEnquiryPage();
		contactUs.FillDetailsOnFormAndSubmit();
		
	}
	
	
	
	
}
