package JavascriptExecutorPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ScrollTest {
	@Test
	public void ScrollDownTest()throws Exception{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///E:/Html%20program/link8.html");
		RemoteWebDriver r=(RemoteWebDriver)driver;
        String c="windows.scrollTo(0,document.body.scrollHeight()";
        Thread.sleep(3000);
        r.executeScript(c);
        driver.close();
	}

}
