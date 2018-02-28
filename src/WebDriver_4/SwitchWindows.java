package WebDriver_4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {
	
	public static void main(String arg[]){
	    WebDriver driver;
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		driver = new ChromeDriver();

	    //Maximize the window
	    driver.manage().window().maximize();

	    driver.get("http://www.rediff.com/");

	    //Get all window handles
	    Set<String> allHandles = driver.getWindowHandles();

	    //count the handles Here count is=2
	    System.out.println("Count of windows:"+allHandles.size());      

	    //Get current handle or default handle
	    String currentWindowHandle = allHandles.iterator().next();
	    System.out.println("currentWindow Handle"+currentWindowHandle);

	    //Remove first/default Handle
	    allHandles.remove(allHandles.iterator().next());

	    //get the last Window Handle
	    String lastHandle = allHandles.iterator().next();
	    System.out.println("last window handle"+lastHandle);

	    //switch to second/last window, because we know there are only two windows 1-parent window 2-other window(ad window)
	driver.switchTo().window(lastHandle);
	    System.out.println(driver.getTitle());
	    driver.findElement(By.tagName("body")).click();
	    driver.close();
	}

}
