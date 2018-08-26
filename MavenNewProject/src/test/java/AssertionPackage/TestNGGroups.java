package AssertionPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGroups {
@Test(priority=1,groups="smoke")
public void testCaseOne() {
	Reporter.log("TestCase1",true);
}
@Test(priority=2,groups="smoke")
public void testCaseTwo() {
	Reporter.log("TestCase2",true);
}
@Test(priority=3,groups="regression")
public void testCaseThree() {
	Reporter.log("TestCase3",true);
}
@Test(priority=4,groups="regression")
public void testCaseFour() {
	Reporter.log("TestCase4",true);
}
}
