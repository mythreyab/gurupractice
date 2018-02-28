package Package_IE_Chrome_Firefox;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class LaunchingBrowsers{
 
 public static String str = "FireFox";
 
 public static void main(String args[]) throws InterruptedException
 {
  
  System.setProperty("webdriver.chrome.driver" , "C:\\Selenium_Projects\\Geo_Driver\\chromedriver.exe");
  System.setProperty("webdriver.ie.driver","C:\\Selenium_Projects\\Geo_Driver\\IEDriverServer.exe");
  System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"C:\\Selenium_Projects\\Geo_Driver\\geckodriver.exe");
  
  WebDriver driver=null;
  
  if(str.equals("Chrome"))
  {
   //System.out.println("uma");
    driver= new ChromeDriver();
   
  }
  
  else if (str.equals("IE"))
  {
   driver = new InternetExplorerDriver();
  }
  
  else if (str.equals("FireFox"))
   
  {
      DesiredCapabilities capabilities = DesiredCapabilities.firefox();
      capabilities.setCapability("firefox_binary","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
      capabilities.setCapability("platform", "WIN10");
      capabilities.setCapability("version", "52.0.1");
      capabilities.setCapability("marionette", true);
      capabilities.setCapability("acceptSslCerts", true);
      driver = new FirefoxDriver(capabilities);
  }
  driver.get("http://www.facebook.com");
  driver.close();

 } 
  

}