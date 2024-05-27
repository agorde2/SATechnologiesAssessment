package base;

import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Runner extends Base{

	public static ExtentReports Extent;
	public static ExtentTest Tlogger;
	
	
	 ExtentHtmlReporter htmlReporter;
	 
	    protected ExtentReports extent;
	    protected ExtentTest test;
	 
	    @BeforeTest
	    public void startReport() {
	        // initialize the HtmlReporter
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/MainReport.html");
	 
	        //initialize ExtentReports and attach the HtmlReporter
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	 
	 
	        //configuration items to change the look and feel
	        //add content, manage tests etc
	        //htmlReporter.config().setChartVisibilityOnOpen(true);
	        htmlReporter.config().setDocumentTitle("Simple Automation Report");
	        htmlReporter.config().setReportName("Test Report");
	        //htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
	        //htmlReporter.config().setTheme(Theme.STANDARD);
	        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
	    }
	    
	    @AfterMethod
	    public void getResult(ITestResult result) throws Exception {
	        if(result.getStatus() == ITestResult.FAILURE) {
	        	takeSnapShot(driver, System.getProperty("user.dir") +"/Screenshots/s.png");
	            test.log(Status.FAIL,result.getThrowable());
	            test.log(Status.FAIL,"screenshot:"+test.addScreenCaptureFromPath(System.getProperty("user.dir") +"/Screenshots/s.png"));

	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, result.getTestName());
	        }
	        else {
	            test.log(Status.SKIP, result.getTestName());
	        }
	    }
	 
	    @AfterTest
	    public void tearDown() {
	        //to write or update test information to reporter
	    	driver.close();
	        extent.flush();
	        
	    }
	    
	    
	    
	    
	    
	
	
	
	
	
}
