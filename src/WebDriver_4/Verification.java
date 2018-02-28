package WebDriver_4;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {
	public static void main(String arg[]){

		WebDriver driver;
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
try {
assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("Create an account"));
} catch (Error e) {
	System.out.println(e);;
}
assertFalse(driver.findElement(By.cssSelector("BODY")).getText().matches("Create an account"));
System.out.println(!driver.findElements(By.id("pass")).isEmpty());
Assert.assertEquals(0, driver.findElements(By.id("pass")).size());
driver.close();
	}

}
