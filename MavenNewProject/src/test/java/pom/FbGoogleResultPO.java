package pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class FbGoogleResultPO extends BasePage{

	public FbGoogleResultPO(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a")
	private List<WebElement> allLinks;
	public int allLinks() {
		
		return allLinks.size(); 
	}
	@FindBy(xpath="//a[text()='Facebook - Log In or Sign Up']")
	    private WebElement fbSrchResLink;
	public WebElement fbSrchResLink() {
		return fbSrchResLink;
	}
	

}
