package WebDriver_4;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class Synchronization_Thread4 {
	public static void main(String arg[]) throws InterruptedException{

		WebDriver driver;
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				//Wait for the condition
			       .withTimeout(60, TimeUnit.SECONDS) 
			         // which to check for the condition with interval of 5 seconds. 
			       .pollingEvery(5, TimeUnit.SECONDS) 
			     //Which will ignore the NoSuchElementException
			       .ignoring(NoSuchElementException.class);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		driver.close();
}
}	
