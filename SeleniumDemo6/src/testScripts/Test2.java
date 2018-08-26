package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Link1PO;

public class Test2 extends BaseTest{
	@Test
	public void testFaceBookLink() {
		try
		{
			Link1PO link1PO=new Link1PO(driver);
			link1PO.myFaceBookLink().click();
			String aTitle=driver.getTitle();
			System.out.println(driver.getTitle());
			String eTitle="Facebook – log in or sign up1";
	        Assert.assertEquals(aTitle,eTitle);
		}
		catch(Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
	}

}
