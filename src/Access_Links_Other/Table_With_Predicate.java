package Access_Links_Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Table_With_Predicate {
	public static void main(String[] args) { 
	System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
	 WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
   String baseUrl = "http://newtours.demoaut.com/";
    driver.get(baseUrl);
    String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
    System.out.println(innerText);
    driver.quit();
	}

}
