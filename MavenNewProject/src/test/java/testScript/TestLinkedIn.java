package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Library.BaseTest;
import pom.GooglePagePO;
import pom.LinkedInGoogleResultPO;

public class TestLinkedIn extends BaseTest{
	@Test (priority=3)
	public void TestLinkedIn1() {
		GooglePagePO googlePO=new GooglePagePO(driver);
		googlePO.googleSrch("linkedin");
		LinkedInGoogleResultPO linkedInGoPO=new LinkedInGoogleResultPO(driver);
		Reporter.log("Total.no.of links="+linkedInGoPO.allLinks(), true);
		linkedInGoPO.linkedInSrchResLink().click();
		System.out.println(driver.getTitle());
		try {
		String eTitle="LinkedIn: Log In or Sign Up";
		linkedInGoPO.checkTitle(eTitle);
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
		}
		catch(Exception e) {
			Reporter.log("Exception Generated",true);
			Assert.fail();		
		}
	}

}
