/**
 * 
 */
/**
 * @author Rama
 *
 */
package Package_Grid;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import org.junit.Assert;
import java.net.URL;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;		


public class Grid_TestCase {


		@Test
		public void mailTest() throws MalformedURLException{
		DesiredCapabilities dr=null;
		String browserType ="chrome";
		WebDriver driver;
		if(browserType.equals("chrome")){
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		dr=DesiredCapabilities.chrome();
		dr.setBrowserName("chrome");
		dr.setPlatform(Platform.WIN10);
	    driver=new RemoteWebDriver(new URL("http://192.168.0.100:5566/wd/hub"), dr);
	    driver.get("http://gmail.com");
		String aName = driver.getTitle();
		if(aName.equals("Gmail")){
		System.out.println("Test is passed");
		}
		else {
		System.out.println("Test is Failed");
		}
		}else if(browserType.equals("edge")){
		System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
		dr=DesiredCapabilities.edge();
		dr.setBrowserName("MicrosoftEdge");
		dr.setPlatform(Platform.WIN10);
	    driver=new RemoteWebDriver(new URL("http://192.168.0.100:5566/wd/hub"), dr);
	    driver.get("http://gmail.com");
		String aName = driver.getTitle();
		
		if(aName.equals("Gmail")){
		System.out.println("Test is passed");
		}
		else {
		System.out.println("Test is Failed");
		}
		}
		else{
			System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
            dr = DesiredCapabilities.htmlUnit();
            dr.setBrowserName("htmlunit");
            dr.setPlatform(Platform.WIN10);
    	    driver=new RemoteWebDriver(new URL("http://192.168.0.100:5566/wd/hub"), dr);
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

	    driver.close();
		}
	 }