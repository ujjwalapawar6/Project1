package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Library.BaseTest;
import pom.GooglePagePO;
import pom.TwitterGoogleResultPO;

public class TestTwitter extends BaseTest {
	@Test (priority=4)
	public void TestTwitter1() {
		GooglePagePO googlePO=new GooglePagePO(driver);
		googlePO.googleSrch("twitter");
		TwitterGoogleResultPO twitterGoPO=new TwitterGoogleResultPO(driver);
		Reporter.log("Total.no.of links="+twitterGoPO.allLinks(), true);
		twitterGoPO.twitterSrchResLink().click();
		System.out.println(driver.getTitle());
		try {
		String eTitle="Login on Twitter";
		twitterGoPO.checkTitle(eTitle);
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
		}
		catch(Exception e) {
			Reporter.log("Exception Generated",true);
			Assert.fail();		
		}
	}

}
