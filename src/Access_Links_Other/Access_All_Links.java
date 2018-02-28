package Access_Links_Other;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
public class Access_All_Links {
	public static void main(String[] args) {
		 System.setProperty ("webdriver.gecko.driver","C:\\Selenium_Projects\\New_Driver\\geckodriver.exe" );
		 FirefoxOptions options = new FirefoxOptions();
		 options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine
	 
		WebDriver driver = new FirefoxDriver(options);
        String baseUrl = "http://newtours.demoaut.com/";
        String underConsTitle = "Under Construction: Mercury Tours";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get(baseUrl);
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        String[] linkTexts = new String[linkElements.size()];
        int i = 0;

        //extract the link texts of each link element
        for (WebElement e : linkElements) {
            linkTexts[i] = e.getText();
            i++;
        }

        //test each link
        for (String t : linkTexts) {
            driver.findElement(By.linkText(t)).click();
            if (driver.getTitle().equals(underConsTitle)) {
                System.out.println("\"" + t + "\""
                        + " is under construction.");
            } else {
                System.out.println("\"" + t + "\""
                        + " is working.");
            }
            driver.navigate().back();
        }
        baseUrl = "https://www.facebook.com/login/identify?ctx=recover";


        driver.get(baseUrl);
        //click on the "Facebook" logo on the upper left portion
        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();

        //verify that we are now back on Facebook's homepage
        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
            System.out.println("We are back at Facebook's homepage");
        } else {
            System.out.println("We are NOT in Facebook's homepage");
        }

        driver.quit();

    }
}
