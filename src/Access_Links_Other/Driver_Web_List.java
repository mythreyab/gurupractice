package Access_Links_Other;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Web_List {
	public static void main(String[] args) {
		 System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
		 WebDriver driver = new org.openqa.selenium.edge.EdgeDriver();
		driver.get("http:\\quiker.com");
 
		WebElement StateDrpdown = driver.findElement(By.xpath("//*[@id='categoryId']"));
		List<WebElement> StateList = StateDrpdown.findElements(By.tagName("Option"));
 
		for(int i=0;i<StateList.size();i++){
 
			System.out.println(StateList.get(i).getText());
		}
         }
}
