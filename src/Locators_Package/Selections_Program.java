package Locators_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selections_Program {
 public static void main(String[] args) { 
	 System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
	 WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
	    String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
		driver.get(baseUrl);
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARCTICA");
		//Selecting Items in a Multiple SELECT elements
		driver.get("http://jsbin.com/osebed/2");
		Select fruits = new Select(driver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		fruits.selectByIndex(0);
	//	driver.close();
 }
}