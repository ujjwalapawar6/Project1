package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Link1PO;

public class Test1 extends BaseTest{
	@Test
public void testGoogleLink() {
		try {
			Link1PO link1PO=new Link1PO(driver);
			link1PO.myGoogleLink().click();
			String aTitle=driver.getTitle();
			String eTitle="Google1";
			Assert.assertEquals(aTitle,eTitle);
			}
		catch(Exception e) {
			Reporter.log("Exception Generated",true);
			Assert.fail();
		}
	}
}
