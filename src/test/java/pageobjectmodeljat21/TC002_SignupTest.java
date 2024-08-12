package pageobjectmodeljat21;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectsSpecificMethod;
import pages.SignupPage;

public class TC002_SignupTest extends ProjectsSpecificMethod {

SignupPage signupage;

@Test
public void SignupTest() throws InterruptedException {
	signupage=new SignupPage(driver);
	signupage.clickSignupLandingPageBtn();
	signupage.enterSignupusername("subhash2050");
	signupage.enterSignupuserpassword("admin123");
	signupage.clickSignupregistrationbtn();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();

	String actual=alert.getText();
	String expected="Sign up successful.";
	Assert.assertEquals(actual,expected);
	Thread.sleep(2000);
}
	
}
