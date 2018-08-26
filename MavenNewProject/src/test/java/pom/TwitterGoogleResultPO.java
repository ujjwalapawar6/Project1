package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class TwitterGoogleResultPO extends BasePage{

	public TwitterGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinks() {
		
		return allLinks.size(); 
	}
	@FindBy(xpath="//a[text()='Login on Twitter']")
	    private WebElement twitterSrchResLink;
	public WebElement twitterSrchResLink() {
		return twitterSrchResLink;
	}
}
