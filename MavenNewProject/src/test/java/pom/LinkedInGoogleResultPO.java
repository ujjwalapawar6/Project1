package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class LinkedInGoogleResultPO extends BasePage {

	public LinkedInGoogleResultPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinks() {
		
		return allLinks.size(); 
	}
	@FindBy(xpath="//a[text()='LinkedIn: Log In or Sign Up']")
	    private WebElement linkedInSrchResLink;
	public WebElement linkedInSrchResLink() {
		return linkedInSrchResLink;
	}
	
}
