package baseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import org.apache.xpath.functions.Function;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
//import com.google.common.base.Function;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import junit.textui.TestRunner;

public class BaseClass {

	public static WebDriver driver;

	//public static Properties properties = new Properties();
	
	 static Properties p=new Properties();  
	 public static ConfigFileReader configFileReader = new ConfigFileReader();  
	/*File file = new File(System.getProperty("user.dir") + "/src/main/resources/config.properties");
	public Properties Config = new Properties();
	FileInputStream fileInput  ;
	{ 
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		//load properties file
		try {
			Config.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();}
	}*/

	/*public static ConfigFileReader configFileReader = new ConfigFileReader();

	public String appURL = configFileReader.getApplicationUrl();
	public String browser = configFileReader.getBrowser();
	public String uName = configFileReader.getUserName();
	public String pwd = configFileReader.getPassword();*/

	//WebDriverWait wait = new WebDriverWait(driver, 60);
	 public static String globaldate;
	 public static void createfolder(){
		 Date dNow = new Date( );
			SimpleDateFormat ft = new SimpleDateFormat ("MMddyyyyhhmmss");
			globaldate = ft.format(dNow);
			File dir = new File(System.getProperty("user.dir") + "/screenshots"+globaldate); 
			dir.mkdir();
	 }
	 
	 
	public static void browserlaunch() {
		
		setDriver(configFileReader.getBrowserName(),configFileReader.getApplicationUrl());
	}
	public static WebDriver setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "CHROME":
			driver = initChromeDriver(appURL);
			break;
		case "FIREFOX":
			driver = initFirefoxDriver(appURL);
			break;
		case "EDGE":
			driver = initEDGEDriver(appURL);
			break;
		}
		return driver;
	}

	public static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		/*System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		chromeOptions.addArguments("--no-sandbox");
		chromeOptions.addArguments("--proxy-server='direct://'");
		chromeOptions.addArguments("--proxy-bypass-list=*");
		chromeOptions.addArguments("--window-size=1920,1080");
		chromeOptions.addArguments("--start-maximised");*/

		/*String downloadFilepath = System.getProperty("user.dir") + "/src/main/resources/";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver = new ChromeDriver(cap);*/

		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browserdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		pageLoadTimeout();
		return driver;
	}

	public static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Browserdriver\\geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
		    capabilities.setCapability("marionette",true); 
		driver = new FirefoxDriver(capabilities);
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		pageLoadTimeout();
		return driver;
	}

	public static WebDriver initEDGEDriver(String appURL) {
		System.setProperty("webdriver.edge.driver", "src\\test\\resources\\Browserdriver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		pageLoadTimeout();
		return driver;
	}

	public static void closeDriver() {
		driver.close();
	}

	public static void quitDriver() {
		driver.quit();
	}
	
	public static void Screenshot(WebElement element) throws SQLException, ClassNotFoundException, IOException {
		File screenshotFile2=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date dNow = new Date( );
		SimpleDateFormat ft = new SimpleDateFormat ("MMddyyyyhhmmss");
		Files.copy(screenshotFile2,new File(System.getProperty("user.dir") + "/screenshots/" + ft.format(dNow)+".png"));
	}

	public static void Screenshot() throws SQLException, ClassNotFoundException, IOException {

		/*File lastModified1 = recentfolder(System.getProperty("user.dir"));
		File lastModified = recentfolder(lastModified1.toString());*/
		File screenshotFile2=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Date dNow = new Date( );
		SimpleDateFormat ft = new SimpleDateFormat ("MMddyyyyhhmmss");
		//System.out.println(lastModified+"\\"+ft.format(dNow)+".png");
		Files.copy(screenshotFile2, new File(System.getProperty("user.dir") + "/screenshots"+globaldate+"/"+ ft.format(dNow)+".png"));
	}
	
	public static byte[] Screenshotreport(){
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		return screenshot;
	}

	public static File recentfolder(String Path) {
		File dir = new File(Path);
		File[] files = dir.listFiles();
		File lastModified = Arrays.stream(files).filter(File::isDirectory).max(Comparator.comparing(File::lastModified)).orElse(null);
		// System.out.println(lastModified);
		return lastModified;
	}

	public static void selectByText(WebElement element, String dropdownValue) {
		try {
			Select dd = new Select(element);
			/*WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(dropDown));*/
			explicitWaitVisible(element);
			dd.selectByVisibleText(dropdownValue);
			highLightElement(element);
		} catch (Exception e) {

			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}
	}

	public static void sendKeys(WebElement element, String text) throws ClassNotFoundException, SQLException, IOException {
		try {
			pageLoadTimeout();
			explicitWaitVisible(element);
			element.clear();
			element.sendKeys(text);
		} catch (Exception e) {
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		} 
	}
	
	public static void ClearTB(WebElement element, String text) throws ClassNotFoundException, SQLException, IOException {
		try {
			pageLoadTimeout();
			explicitWaitVisible(element);
			element.clear();
		} catch (Exception e) {
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		} 
	}

	public static void sendKeys(WebElement element, Keys key) throws ClassNotFoundException, SQLException, IOException {
		try {
			//WebDriverWait wait = new WebDriverWait(driver, 60);
			//wait.until(ExpectedConditions.elementToBeClickable(element));
			pageLoadTimeout();
			element.sendKeys(key);
			//highLightElement(element);
		} catch (Exception e) {
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		} 
	}
	
	public static void click(WebElement element) throws ClassNotFoundException, SQLException, IOException {
		try {			
			/*WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(element));*/
			
			explicitWaitClick(element);
			highLightElement(element);
			element.click();
			pageLoadTimeout();
		} catch (Exception e) {
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
		} 
	}
	
		
	public static void click(String xpath) throws ClassNotFoundException, SQLException, IOException {
		
			try {
				WebDriverWait wait = new WebDriverWait(driver, 60);
				
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
				driver.findElement(By.xpath(xpath)).click();
				pageLoadTimeout();
			}catch (Exception e) {
				Assert.assertTrue("Element Not Found" + xpath + "| Error - " + e,false);
			}
			
		
	}

	public static void clear(WebElement element) throws ClassNotFoundException, SQLException, IOException {
		try {			
			explicitWaitClick(element);
			element.clear();
		} catch (Exception e) {
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		} 
	}

	public static String getText(WebElement element) throws ClassNotFoundException, SQLException, IOException {
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String text = null;
		try {
			explicitWaitVisible(element);
			highLightElement(element);
			text = element.getText();
		} catch (Exception e) {
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		} 
		return text;
	}

	public static int getNumber(WebElement element) throws ClassNotFoundException, SQLException, IOException {
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		String text = null;
		try {
			explicitWaitVisible(element);
			highLightElement(element);
			text = element.getText();
		} catch (Exception e) {
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
		} 
		return Integer.parseInt(text);
	}

	public static void highLightElement(WebElement element) throws ClassNotFoundException, SQLException, IOException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;');", element);
		try 
		{
			Thread.sleep(1000);
		} 
		catch (Exception e) {
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}
		//Screenshot(element);
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px transparent');", element);
	}

	public void ScrollToElement(WebElement element) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",element);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	public boolean isElementDisplayed(WebElement element, boolean expected) throws Throwable
	{
		//implicitWait();
		boolean status = false;
		boolean actualstatus = false;
		try
		{
			explicitWaitVisible(element);
			element.isDisplayed();
			highLightElement(element);
			status = true;
		}
		catch(Exception e)
		{
			status = false;
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}

		if(expected == status) {
			actualstatus = true;
			//Assert.assertTrue(true);
		}
		else {
			actualstatus = false;
			//Assert.assertFalse(true);
		}

		return actualstatus;
	}
	
	public boolean isElementEnabled(WebElement element, boolean expected) throws Throwable
	{
		//implicitWait();
		boolean status = false;
		boolean actualstatus = false;
		try
		{
			explicitWaitVisible(element);
			element.isEnabled();
			highLightElement(element);
			status = true;
		}
		catch(Exception e)
		{
			status = false;
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}

		if(expected == status) {
			actualstatus = true;
			//Assert.assertTrue(true);
		}
		else {
			actualstatus = false;
			//Assert.assertFalse(true);
		}

		return actualstatus;
	}
	
	public boolean verifywebelementcontents(WebElement element, String expectedtext, boolean expected){
		
		boolean status = false;
		boolean actualstatus = false;
		try{
			//explicitWaitVisible(element);
			 element.getText().toString().trim().contains(expectedtext);
			 status=true;
			}catch(Exception e)
			{
				status = false;
				Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
			}
		if(expected == status) {
			actualstatus = true;
			//Assert.assertTrue(true);
		}
		else {
			actualstatus = false;
			//Assert.assertFalse(true);
		}
		return actualstatus;
	}
	
	public void CompareExactText(WebElement element, String expectedtext){
		
		try{
			explicitWaitVisible(element);
			 element.getText().toString().trim().equals(expectedtext);
			}catch(Exception e)
			{
				Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
			}
	}

	public static void implicitWait()
	{
		try {
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}catch (Exception e) {
			e.printStackTrace();
			//Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}
	}
	
	public static void scrollBottom(){
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		pageLoadTimeout();
	}

	public static void pageLoadTimeout()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(driver, 80);

		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver wdriver) {
				return ((JavascriptExecutor) driver).executeScript(
						"return document.readyState"
						).equals("complete");
			}
		});

	
	}

	public static void explicitWaitClick(WebElement element)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}
	}

	public static void explicitWaitVisible(WebElement element)
	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
		}
	}

	public static void sleepWait(int n) throws InterruptedException
	{
		try {
			Thread.sleep(n);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fluentWait(WebElement element)
	{/*
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(60, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
			element = wait.until(new Function<WebDriver, WebElement>() {
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	 */}
	public WebElement stringToWebelt(String xpath)
	{
		WebElement elt = null;
		try {
			elt = driver.findElement(By.xpath(xpath));
		}catch (Exception e) {
			e.printStackTrace();
			//Reporter.log("Element Not Found" + xpath + "| Error - " + e);
		} 
		return elt;
	}

	public boolean isElementDisplayed(String xpath, boolean expected) throws Throwable
	{
		boolean status = false;
		boolean actualstatus = false;
		try
		{
			implicitWait();
			WebElement element = driver.findElement(By.xpath(xpath));
			element.isDisplayed();
			highLightElement(element);
			status = true;
		}
		catch(Exception e)
		{
			
			status = false;
			Assert.assertTrue("Element Not Found" + xpath + "| Error - " + e,false);
		}

		if(expected == status) {
			actualstatus = true;
			//Assert.assertTrue(true);
		}
		else {
			actualstatus = false;
			//Assert.assertFalse(true);
		}
		return actualstatus;
	}
	
	public boolean isElementNotDisplayed(String xpath, boolean expected) throws Throwable
	{
		boolean status = false;
		boolean actualstatus = false;
		try
		{
			List<WebElement> elements = driver.findElements(By.xpath(xpath));
			int count = elements.size();
			if(count == 0)
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		catch(Exception e)
		{
			
			status = false;
		}
		if(status==true){
			return true;
		}
		else
		{
			//Assert.assertTrue("Element Found " + xpath + "| Error - ",false);
			status=false;
		}

		return actualstatus;
	}
	
	public boolean isElementNotDisplayed1(String xpath, boolean expected) throws Throwable
	{
		boolean status = false;
		boolean actualstatus = false;
		try
		{
			List<WebElement> elements = driver.findElements(By.xpath(xpath));
			int count = elements.size();
			if(count == 0)
			{
				status = true;
			}
			else
			{
				status = false;
				throw new Exception("Element found and is displayed in storefront");
			}
		}
		catch(Exception e)
		{
			
			status = false;
			Assert.assertTrue("Element Found" + xpath + "| Error - " + e,false);
		}
		if(status==true){
			return true;
		}
		else
		{
			status=false;
		}

		return actualstatus;
	}
	
	
	
	public boolean isElementdisabled(WebElement element, boolean expected) throws Throwable
	{
		boolean status = false;
		boolean actualstatus = false;
		try
		{
			if(element.isEnabled()){
				status = true;
			}
			else
				status=false;
			
		}
		catch(Exception e)
		{
			status = false;
			Assert.assertTrue("Element is enabled" + element + "| Error - " + e,false);
		}
		if(expected == status) {
			actualstatus = true;
		}
		else {
			actualstatus = false;
			Assert.assertTrue("Element is enabled" + element + "| Error - ",false);
		}
		return actualstatus;
	}
	
	public static void verifypagetitle(String expectedtext){
		Boolean status =true;
		
		Boolean actualstatus = driver.getTitle().contains(expectedtext);
		if (status == actualstatus){
			actualstatus = true;
		}
		else
		{
			Assert.assertTrue("Page title mismatch- actual title-"+driver.getTitle() + "expected -"+expectedtext,false);
		}
	}
	
	public static void verifypageURL(String expectedurl){
		Boolean status =true;
		
		Boolean actualstatus = driver.getCurrentUrl().contains(expectedurl);
		if (status == actualstatus){
			actualstatus = true;
		}
		else
		{
			Assert.assertTrue("Page URL mismatch- actual URL-"+ driver.getCurrentUrl() + "expected -"+expectedurl,false);
		}
	}
	
	public static void verifyBreadcrumbbar(WebElement element,String expectedtext){
		boolean actualstatus = false;
		String breadcrumbtext = element.getText();
		String newbreadcrumbtext = breadcrumbtext.replace("\n","");
		
		if(newbreadcrumbtext.equals(breadcrumbtext)){
			actualstatus = true;
		}
		else
		{
			Assert.assertTrue("Bread crumbbar text mismatch actual = " +newbreadcrumbtext+ "Expected = "+expectedtext,false);
		}
			
		
	}
	
	
	public boolean isElementDisplayed(String xpath) throws Throwable
	{
		boolean status = false;
		//boolean actualstatus = false;
		try
		{
			//WebDriverWait wait = new WebDriverWait(driver, 60);
			implicitWait();
			WebElement element = driver.findElement(By.xpath(xpath));
			element.isDisplayed();
			highLightElement(element);
			status = true;
		}
		catch(Exception e)
		{
			status = false;
			Assert.assertTrue("Element Not Found" + xpath + "| Error - " + e,false);
		}

		/*if(expected == status) {
			actualstatus = true;
			//Assert.assertTrue(true);
		}
		else {
			actualstatus = false;
			//Assert.assertFalse(true);
		}*/
		return status;
	}

	public boolean isSelected(WebElement element) {
		try
		{
			explicitWaitVisible(element);
			boolean bool = element.isEnabled();
			highLightElement(element);
			return bool;
		}
		catch (Exception e) {
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
			return false; 
			
		}
	}

	public String getAttribute(WebElement webelem, String Attribute) {
		try
		{
			implicitWait();
			String bool = webelem.getAttribute(Attribute);
			return bool;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//Reporter.log("Element Not Found" + webelem + "| Error - " );
			Assert.assertTrue("Element Not Found" + webelem + "| Error - " + e,false);
			return "No Attribute Found";
		}
	}



	public String getCurrentDateTime() {  
		Date date = Calendar.getInstance().getTime();  
		DateFormat dateFormat = new SimpleDateFormat("yyyymmddhhmmss");  
		String strDate = dateFormat.format(date);  
		return strDate;
	}

	public static void jsClick(WebElement element) throws ClassNotFoundException, SQLException, IOException {
		try {		
			explicitWaitVisible(element);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			//Assert.assertTrue(false, "Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Element Not Found" + element + "| Error - " + e,false);
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
		} 
	}

	public static String getRequiredDay(int n) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, n);
		String newDate = sdf.format(cal.getTime());
		return newDate;
	}

	

	
	public void Switchtoframe(String framename) throws Exception {
		try {
			System.out.println("Navigated to New Frame");
			WebDriverWait WDwait= new WebDriverWait(driver, 45);
			WDwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename));
		} catch(NoSuchElementException nse){
			System.out.println("Element Not Found | Error - "+ nse);
			Assert.assertTrue("Element Not Found" + framename + "| Error - " + nse,false);
			// Reporter.log("Element Not Found | Error - "+ nse);
		}
	} 
	
	public void Switchtoframe(WebElement framename) throws Exception {
		try {
			System.out.println("Navigated to Switchtoframe(Name) method");
			WebDriverWait WDwait= new WebDriverWait(driver, 45);
			WDwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framename));
		} catch(NoSuchElementException nse){
			System.out.println("Element Not Found | Error - "+ nse);
			Assert.assertTrue("Element Not Found" + framename + "| Error - " + nse,false);
			// Reporter.log("Element Not Found | Error - "+ nse);
		}
	} 

	public void Switchtoframe(int a) throws Exception {
		try {
			System.out.println("Navigated to Switchtoframe(Int) method");
			System.out.println("No. of frame tags :  " +driver.findElement(By.tagName("iframe")));
			WebDriverWait WDwait= new WebDriverWait(driver, 45);
			WDwait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(a));
		} catch(NoSuchElementException nse)
		{
			System.out.println("Element Not Found | Error - "+ nse);
			Assert.assertTrue("Element Not Found" + a + "| Error - " + nse,false);
			// Reporter.log("Element Not Found | Error - "+ nse);
		}
	}
	public void switchToDefault() {
		try
		{
			driver.switchTo().defaultContent();
		}
		catch(NoSuchElementException nse)
		{
			System.out.println("Unable to switch to default frame" + nse);
			//Reporter.log("Unable to switch to default frame"+"| Error - " + nse);
			
		}
	}
	
	public static void elementHover(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		}
	

	 public static String switchWindow(){
	    	String window1 = driver.getWindowHandle();
			for (String windowHandle : driver.getWindowHandles()) {
				if (!(window1.equalsIgnoreCase(windowHandle))) {
					driver.switchTo().window(windowHandle);
					System.out.println("switching is happenning");
					break;
				}
					System.out.println("same window");
			}
			return window1;
	    }
	    
	    public static void switchToDefaultWindow(String defaultWindow){
	    	if (defaultWindow != null) {
				if (!(defaultWindow.equals(driver.getWindowHandle()))) {
					closeCurrentWindow();
				}
				driver.switchTo().window(defaultWindow);
			}
	    	
	    }
	    
		private static void closeCurrentWindow() {
			driver.close();
		}

	
	
}
