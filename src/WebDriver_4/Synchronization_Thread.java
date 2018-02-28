package WebDriver_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronization_Thread {
	public static void main(String arg[]) throws InterruptedException{

		WebDriver driver;
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		Thread.sleep(60000);
		driver.get("http://www.facebook.com");
		driver.close();
}
}
