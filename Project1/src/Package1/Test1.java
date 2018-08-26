package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args)throws Exception
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("file:///E:/Html%20program/Textbox.html");
		WebElement txtBx1 = driver.findElement(By.id("a1"));
		String txtBx1Val = txtBx1.getAttribute("value");
		System.out.println(txtBx1Val);
		driver.close();

	}

}
