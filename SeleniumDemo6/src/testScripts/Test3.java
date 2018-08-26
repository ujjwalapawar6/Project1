package testScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.Link1PO;

public class Test3 extends BaseTest{
	@Test
	public void testGoogleLink() {
			try {
				Link1PO link1PO=new Link1PO(driver);
				link1PO.myTwitterLink().click();
				String aTitle=driver.getTitle();
				System.out.println(driver.getTitle());
				String eTitle="Twitter. It's what's happening.";
				Assert.assertEquals(aTitle,eTitle);
				}
			catch(Exception e) {
				Reporter.log("Exception Generated",true);
				Assert.fail();
			}
}
}