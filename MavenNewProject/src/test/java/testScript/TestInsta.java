package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Library.BaseTest;
import pom.GooglePagePO;
import pom.InstaGoogleResultPO;

public class TestInsta extends BaseTest{
	@Test (priority=2)
	public void TestInstagram1() {
	GooglePagePO googlePO=new GooglePagePO(driver);
	googlePO.googleSrch("instagram");
	InstaGoogleResultPO instaGoPO=new InstaGoogleResultPO(driver);
	Reporter.log("Total.no.of links="+instaGoPO.allLinks(), true);
	instaGoPO.instaSrchResLink().click();
	System.out.println(driver.getTitle());
	try {
	String eTitle="Instagram";
	instaGoPO.checkTitle(eTitle);
	String aTitle = driver.getTitle();
	Assert.assertEquals(aTitle,eTitle);
	}
	catch(Exception e) {
		Reporter.log("Exception Generated",true);
		Assert.fail();		
	}
}

}
