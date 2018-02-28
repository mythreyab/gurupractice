package FireFox_Profile;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfile2{
public static void main(String[] args) {
	System.setProperty(GeckoDriverService.GECKO_DRIVER_EXE_PROPERTY,"C:\\Selenium_Projects\\Geo_Driver\\geckodriver.exe");
// Create object for FirefoxProfile
	FirefoxProfile myprofile=new FirefoxProfile (new File("C:\\Users\\Rama\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\jylfn2cj.default "));  
// Initialize Firefox driver    
	WebDriver driver = new FirefoxDriver(myprofile);
//Maximize browser window       
	driver.manage().window().maximize();
//Go to URL      
	driver.get("http://www.google.com");
//Set  timeout      
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//close firefox browser  
	driver.close();
    }
}