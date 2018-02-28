package Access_Links_Other;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Access_Table_XPath_Complete {
	public static void main(String[] args) { 
	System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
	 WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
   String baseUrl = "http://newtours.demoaut.com/";
    driver.get(baseUrl);
    String innerText = driver.findElement(By.xpath("//table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[2]/tbody/tr[3]/td[2]/font")).getText();
    System.out.println(innerText);
    driver.quit();
	}

}
