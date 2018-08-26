package actiTimePO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import actiTimeLib.BasePage;

public class actiTimeHomePagePO extends BasePage {
public actiTimeHomePagePO(WebDriver driver) {
	super(driver);
}
@FindBy(id="logoutLink")
private WebElement logoutBtn;
public WebElement logoutBtn() {
	return logoutBtn;
}
}
