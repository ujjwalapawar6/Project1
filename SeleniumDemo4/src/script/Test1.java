package script;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//called as test class
public class Test1 {
	@BeforeSuite
	public void testBeforeSuite() {
		Reporter.log("Suite starts",true);
	}
	@AfterSuite
	public void testAfterSuite() {
		Reporter.log("Suite Ends",true);
	}
	
	@BeforeTest
	public void testBeforeTest() {
		Reporter.log("Test Starts",true);
	}
	@AfterTest
	public void testAfterTest() {
		Reporter.log("Test Ends",true);
	}
	@BeforeClass
	public void testBeforeClass() {
		
		Reporter.log("Test class starts",true);
	}
	@AfterClass
	public void testAfterClass() {
		Reporter.log("Test Class ends",true);
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		Reporter.log("Method starts",true);
	}
	
	@AfterMethod
	public void testAfterMethod(){
		Reporter.log("Method Ends", true);
	}
	
	@Test
	public void test1() {
		Reporter.log("Test Method1", true);
	}

}

