package Locators_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Form_Functionality {
	public static void main(String[] args) { 
		// declaration and instantiation of objects/variables
		    	WebDriver driver ;
		   	 System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
			 driver = new org.openqa.selenium.edge.EdgeDriver();
				String baseUrl = "http://newtours.demoaut.com/";
				driver.get(baseUrl);
				// Enter value into textbox
				driver.findElement(By.name("userName")).sendKeys("ramareddy1");
		        driver.findElement(By.name("password")).sendKeys("");
				// Delete value from textbox
		        driver.findElement(By.name("userName")).clear();
				// Access Links
				driver.findElement(By.linkText("REGISTER")).click();
				driver.findElement(By.partialLinkText("REG")).click();
				// Enter value into textbox and SUBMIT
				driver.findElement(By.name("userName")).sendKeys("tutorial1");
		        driver.findElement(By.name("password")).sendKeys("tutorial1");
		        driver.findElement(By.name("password")).submit();

				String baseURL = "http://demo.guru99.com/selenium/facebook.html";
			    driver.get(baseURL);
				WebElement CkEFEBPersist = driver.findElement(By.id("persist box"));
					for (int i=0; i<32; i++) {
						CkEFEBPersist.click (); 
						System.out.println(CkEFEBPersist.isSelected());
					}

		}
}


