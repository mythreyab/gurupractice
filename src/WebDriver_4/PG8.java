package WebDriver_4;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class PG8 {
    
    public static void main(String[] args) throws InterruptedException {
        String baseUrl = "http://www.facebook.com/";
		System.setProperty ("webdriver.chrome.driver","C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();

                driver.get(baseUrl);           
                WebElement txtusername = driver.findElement(By.id("email"));
                Actions  builder = new Actions(driver);
                Action seriesofActions = builder.moveToElement(txtusername).click().keyDown(txtusername,Keys.SHIFT).sendKeys(txtusername,"hello").keyUp(txtusername,Keys.SHIFT).doubleClick(txtusername).contextClick().build();
                seriesofActions.perform();
                Thread.sleep(20000);
                driver.close();
        }
}