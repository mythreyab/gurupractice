package Package_Guru;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;	
import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;		


public class Projecct_Guru_Test_Case3 {
	protected WebDriver driver;
	@Test
	public void guru99tutorials() throws InterruptedException 
	{
    WebDriver driver = new HtmlUnitDriver();
	WebDriverWait wait=new WebDriverWait(driver, 20);
	String eTitle = "Demo Guru99 Page1";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/selenium/guru99home/" );
	aTitle = driver.getTitle();
	System.out.println("The string in the title is  " + aTitle);
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
    WebElement guru99seleniumlink;
	guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	guru99seleniumlink.click();
	driver.close();
	}
	
}