package JavascriptExecutorPack;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//program for Javascript type and Javascript click in selenium 
public class JavascriptTest1 {


@Test
public void testGoogle() {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	WebElement srchTxtBx=driver.findElement(By.name("q"));
	
	//JavaScript Type
	((JavaScriptExecutor)driver).executeScript("arguments[0].value='"+"Selenium"+"'",srchTxtBx);
	WebElement srchBtn=driver.findElement(By.name("btnk"));
	
	//JavaScript Click
	((JavaScriptExecutor)driver).executeScript("arguments[0].click();",srchBtn);
	
}
	
}
