package base;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	
	static public  WebDriver driver;
	static int count =0;
	protected SoftAssert Assert1= new SoftAssert();
	protected Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	{
		if(count!=1)
		{
			System.out.println("****initialize*****Executed");
			driver=new ChromeDriver();
			driver.get("https://www.tendable.com/");
			Assert1= new SoftAssert();
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			count++;
		}
	}
	
	public WebElement findElement(String xpath)
	{
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
		return driver.findElement(By.xpath(xpath));
		
	}
	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileHandler.copy(SrcFile, DestFile);
		//FileUtils.copyFile(SrcFile, DestFile);
		}
	
}