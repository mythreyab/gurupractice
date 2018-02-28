package com.IDE.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.Select;

public class InValidLoginJunit4 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty ("webdriver.edge.driver","C:\\Selenium_Projects\\Geo_Driver\\MicrosoftWebDriver.exe" );
    driver = new org.openqa.selenium.edge.EdgeDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testInValidLoginJunit4() throws Exception {
    driver.get(baseUrl + "/");
    try {
      assertEquals("Welcome: Mercury Tours", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    assertEquals("Welcome: Mercury Tours", driver.getTitle());
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("invalid");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("invalid");
    driver.findElement(By.name("login")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
