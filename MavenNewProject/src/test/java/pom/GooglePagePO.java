package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class GooglePagePO extends BasePage{

	public GooglePagePO(WebDriver driver) {
		super(driver);
		
	}
@FindBy(name="q")
private WebElement searchBx;
public WebElement searchBx() {
	return searchBx;
}
public void googleSrch(String value) {
	searchBx.sendKeys(value);
	searchBx.sendKeys(Keys.ENTER);
}
}
