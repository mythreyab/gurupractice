package Package_Parallel_Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid_Parallel {

	WebDriver driver;
	DesiredCapabilities dr=null;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@BeforeTest
	@Parameters("browser")
	public void setup(@Optional("HtmlUnitDriver") String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("HtmlUnitDriver")){
			System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
            dr = DesiredCapabilities.htmlUnit();
            dr.setBrowserName("htmlunit");
            dr.setPlatform(Platform.WIN10);
    	    driver=new RemoteWebDriver(new URL("http://192.168.0.100:5566/wd/hub"), dr);
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
			dr=DesiredCapabilities.chrome();
			dr.setBrowserName("chrome");
			dr.setPlatform(Platform.WIN10);
		    driver=new RemoteWebDriver(new URL("http://192.168.0.100:5566/wd/hub"), dr);
		}
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
					dr=DesiredCapabilities.edge();
					dr.setBrowserName("MicrosoftEdge");
					dr.setPlatform(Platform.WIN10);
				    driver=new RemoteWebDriver(new URL("http://192.168.0.100:5566/wd/hub"), dr);
	
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testParameterWithXML() throws InterruptedException, MalformedURLException{
	
    		String eTitle = "Demo Guru99 Page1";
    		String aTitle = "" ;
    		// launch Chrome and redirect it to the Base URL
    		driver.get("http://demo.guru99.com/selenium/guru99home/" );
    		aTitle = driver.getTitle();
    		System.out.println("The string in the title is  " + aTitle);
    		//compare the actual title with the expected title
    		if (aTitle.contentEquals(eTitle))
    		{
    		System.out.println( "Test Passed") ;
    		}
    		else {
    		System.out.println( "Test Failed" );
    		}
	    
	    }


	@AfterTest
	public void teardown(){
		driver.close();
	}
	
	
}

