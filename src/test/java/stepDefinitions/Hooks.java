package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;

import baseClass.ConfigFileReader;
import baseClass.BaseClass;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Feature;


public class Hooks extends BaseClass {
	static Properties properties = new Properties();
	public static ConfigFileReader configFileReader = new ConfigFileReader();
	@Before
	public static void beforeScenario() {
	    try {
	        driver.getTitle(); 
	        String CurrURL= driver.getCurrentUrl();
		    if(CurrURL.contains("partner-uat.liftmaster.com") || CurrURL.contains("partner-qa2.liftmaster.com") || CurrURL.contains("partner-qa.liftmaster.com")){
		    	
		    }
		    else{
		    	driver.navigate().to(configFileReader.getApplicationUrl());
		    }
	    }
	    catch(Exception e) {
	    	BaseClass.setDriver(configFileReader.getBrowserName(),configFileReader.getApplicationUrl());
	    }
	    
	}
	
	
	/*@Before
	public static void beforeScenario(Scenario scenario) {
		System.out.println(scenario.getId().split(";")[0]);
		String str = scenario.getId().split(";")[0];
		String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
		File dir = new File(MainUtil.recentfolder(System.getProperty("user.dir")) +"\\"+ cap); 
		dir.mkdir();
	}*/
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {/*
		//if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot) MainUtil.driver).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
				

				File screenshotFile2=((TakesScreenshot) MainUtil.driver).getScreenshotAs(OutputType.FILE);
				Date dNow = new Date( );
				SimpleDateFormat ft = new SimpleDateFormat ("MMddyyyyhhmmss");
				Files.copy(screenshotFile2,new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ft.format(dNow)+".png"));

			} catch (IOException e) {
			} 
		//}
	*/}
	
	
	/*@After(order = 1)
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	      // Take a screenshot...
	    	//byte [] screenshot = MainUtil.Screenshotreport();
	      scenario.embed(MainUtil.Screenshotreport(), "image/png"); // ... and embed it in the report.
	    }
	}*/

	
	@After(order = 0)
	public void afterScenario() throws ClassNotFoundException, SQLException, IOException {
		
		try {
	        driver.getTitle(); //can also use driver.getCurrentUrl()
	        
	    }
	    catch(Exception e) {
	    	BaseClass.setDriver(configFileReader.getBrowserName(),configFileReader.getApplicationUrl());
	        
	    }
	}
}
