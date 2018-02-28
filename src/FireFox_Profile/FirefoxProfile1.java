package FireFox_Profile;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.internal.ProfilesIni;
public class FirefoxProfile1 {
public static void main(String[] args) {
System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"C:\\Selenium_Projects\\Geo_Driver\\geckodriver.exe");
FirefoxOptions options = new FirefoxOptions();
options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
FirefoxDriver driver = new FirefoxDriver(options);
driver.get("http://www.google.com");
//ProfilesIni profile = new ProfilesIni();
//FirefoxProfile myprofile = profile.getProfile("RamaUser");
//Initialize Firefox driver
//WebDriver driver = new FirefoxDriver(myprofile);
//Maximize browser window
driver.manage().window().maximize();
//Go to URL which you want to navigate
//driver.get("http://www.google.com");
//Set  timeout  for 5 seconds so that the page may load properly within that time
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//close firefox browser
driver.close();
}

}


