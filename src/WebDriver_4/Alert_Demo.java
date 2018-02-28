package WebDriver_4;

import org.openqa.selenium.Alert;		
import org.openqa.selenium.By;		
import org.openqa.selenium.NoAlertPresentException;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

public class Alert_Demo {				
	static WebDriver  driver;
        public static void main(String[] args) throws NoAlertPresentException, InterruptedException {									
        	long timeout = 60000;
			System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
			driver = new org.openqa.selenium.edge.EdgeDriver();		
            		
            // Alert Message handling
                        		
            driver.get("http://demo.guru99.com/V4/");			
                                		
            driver.findElement(By.name("uid")).sendKeys("mngr30127");					
            driver.findElement(By.name("password")).sendKeys("EzAtAqy");					
            driver.findElement(By.name("btnLogin")).submit();
            System.out.println(1);
            Thread.sleep(20000);
            long waitForAlert= System.currentTimeMillis() + timeout;
            boolean boolFound = false;
            do
            {
              try
              {
                Alert alert = driver.switchTo().alert();
                if (alert != null)
                {
                  alert.accept();
                  boolFound = true;
                }
              }
              catch (NoAlertPresentException ex) {}
            } while ((System.currentTimeMillis() < waitForAlert) && (!boolFound));
          //  acceptAlertIfAvailable(60000);
             System.out.println(2);
             Thread.sleep(20000);
             driver.findElement(By.name("uid")).sendKeys("mngr30127");					
             driver.findElement(By.name("password")).sendKeys("EzAtAqy");
             System.out.println(3);
             Thread.sleep(20000);
             System.out.println(4);
             driver.findElement(By.name("btnReset")).submit();
             System.out.println(1);
             driver.close();
                // Switching to Alert        

                		
        }	
      /*  public static void acceptAlertIfAvailable(long timeout)
        {
          long waitForAlert= System.currentTimeMillis() + timeout;
          boolean boolFound = false;
          do
          {
            try
            {
              Alert alert = driver.switchTo().alert();
              if (alert != null)
              {
                alert.accept();
                boolFound = true;
              }
            }
            catch (NoAlertPresentException ex) {}
          } while ((System.currentTimeMillis() < waitForAlert) && (!boolFound));
        }*/
}			