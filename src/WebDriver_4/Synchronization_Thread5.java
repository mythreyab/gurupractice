package WebDriver_4;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.util.concurrent.Monitor;
import com.thoughtworks.selenium.Wait;

public class Synchronization_Thread5 {
	
	public static void main(String arg[]) throws InterruptedException{
        WaitClass Wait1 = new WaitClass();
        Wait1.waitmethod();
}
}	

class WaitClass{
	WebDriver driver;
	void waitmethod() throws InterruptedException{
	System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
	driver = new ChromeDriver();
	 synchronized (driver) {
		    driver.notify();
			driver.wait(20000); 
	 }

	driver.get("http://www.facebook.com");
	driver.close();
	}
	
}
