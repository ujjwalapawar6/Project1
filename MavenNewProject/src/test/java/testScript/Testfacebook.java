package testScript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


import Library.BaseTest;
import pom.FbGoogleResultPO;
import pom.GooglePagePO;

public class Testfacebook extends BaseTest{
	//private String value;

	@Test (priority=1)
	public void Testfacebook1() {
		GooglePagePO googlePO=new GooglePagePO(driver);
		//googlePO.searchBx().sendKeys("facebook");
		googlePO.googleSrch("facebook");
		FbGoogleResultPO fbGoPO=new FbGoogleResultPO(driver);
		Reporter.log("Total.no.of links="+fbGoPO.allLinks(), true);
		fbGoPO.fbSrchResLink().click();
		System.out.println(driver.getTitle());
		try {
		String eTitle="Facebook – log in or sign up";
		fbGoPO.checkTitle(eTitle);
		String aTitle = driver.getTitle();
		Assert.assertEquals(aTitle,eTitle);
		}
		catch(Exception e) {
			Reporter.log("Exception Generated",true);
			Assert.fail();		
		}
	}

}
