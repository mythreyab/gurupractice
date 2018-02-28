package Locators_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DocumentIdentifiers {
 
 WebDriver driver;
 
 @BeforeTest
 public void start(){
	 System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
	 driver = new org.openqa.selenium.edge.EdgeDriver();
 }
 
 @Test
 public void ok() throws InterruptedException{
 driver.get("https://docs.google.com/spreadsheet/viewform?fromEmail=true&formkey=dGp5WEhMR0c1SzFTRFhmTjJNVk12T1E6MQ");
//Send text to firstname, lastname and email address fields
 driver.findElement(By.id("entry_2878211")).sendKeys("First Name");
 driver.findElement(By.id("entry_1000003")).sendKeys("Last Name");
 driver.findElement(By.id("entry_1000009")).sendKeys("Emailaddress");
//Setting value for Gender radiobutton
 driver.findElement(By.id("group_1000004_1")).click();
//Selecting values for "Your prefrred Programming language" checkbox
 driver.findElement(By.id("group_1000005_1")).click();
 driver.findElement(By.id("group_1000005_2")).click();
 driver.findElement(By.id("group_1000005_3")).click();
//Setting value for "your Location" dropdown list
 driver.findElement(By.id("entry_1000006")).sendKeys("Non India");
//Giving the value for user rating radiobutton
 driver.findElement(By.id("group_1000007_1")).click();
//sending value to feedback textarea elemenet
 driver.findElement(By.id("entry_1000008")).sendKeys("Adding new comments ");
//Submitting the form
 Thread.sleep(30000);
 driver.findElement(By.name("submit")).submit();   
 }
 
 @AfterTest
 public void close(){
 driver.quit();
 }
}