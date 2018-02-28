package WebDriver_4;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testTabsClass{
	
	WebDriver driver;
	
	@Test
	public void testTabs() {
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
	    driver.get("https://business.twitter.com/start-advertising");
	    assertStartAdvertising();

	    // considering that there is only one tab opened in that point.
	   // ArrayList<String> oldTab = new ArrayList<String>(driver.getWindowHandles());
	    String oldTab = driver.getWindowHandle();
	    driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div/div/header/div[2]/div/div/div[2]/div/a/button")).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    //driver.switchTo().window(newTab.get(0));
	   // driver.findElement(By.xpath("//*[@id='page-wrapper']/div[2]/div/div/header/div[2]/div/div/div[2]/div/a/button")).click();
	    //newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	    assertAdvertisingBlog();

	    // Do what you want here, you are in the new tab

	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	    assertAdvertisingBlog();
        driver.close();
	    // Do what you want here, you are in the old tab
	}

	private void assertStartAdvertising() {
	    assertEquals("Advertising on Twitter", driver.getTitle());
	}

	private void assertAdvertisingBlog() {
	    assertEquals("Login on Twitter", driver.getTitle());
	}

}

