package AssertionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest2 {
	@Test
	public void test1() {
		Reporter.log("Step1" ,true);
		SoftAssert s=new SoftAssert();
		s.assertEquals("abc","abc");
		Reporter.log("Step2",true);
		s.assertEquals("abc","xyz");
		Reporter.log("Step3",true);
		s.assertAll();
		Reporter.log("Step4", true);
	}
	

}
