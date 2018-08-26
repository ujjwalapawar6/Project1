package library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	 public WebDriver driver;
	 @BeforeMethod
	 public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///E:/Html%20program/TestLink.html");
}
	 @AfterMethod
	 public void closeBrowser() {
		 driver.close();
	 }
}
