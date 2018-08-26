package Package1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
//Program for deleting the content of text box using clear method
	public static void main(String[] args)throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","./drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///E:/Html%20program/Textbox.html");
		String txtBxVal1 = driver.findElement(By.id("a1")).getAttribute("value");
		System.out.println(txtBxVal1);
		Thread.sleep(1000);
		 driver.findElement(By.id("a1")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.id("a1")).sendKeys("Webdriver");
		 Thread.sleep(1000);
		 driver.close();
		 
	}
}
