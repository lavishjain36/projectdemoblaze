package pageobjectmodeljat21;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectsSpecificMethod;

public class TC005_Testnew extends ProjectsSpecificMethod {
  @Test(priority = 1)
  public void login() {
	  System.out.println("Method to login into an application.");//3
  }
  
  @Test(priority = 2)
  public void addskillssetDetails() {
	  System.out.println("Method to Add skill set details.");//2
  }
  
  @Test(priority = 4)
  public void logout() {
	  System.out.println("Method to logout from an application.");//4
  }
  
  @Test(priority = 3)
  public void addeducationdetails() {
	  System.out.println("Method to add education details .");//1
  }
  
  @BeforeTest
  public void launchbrowser() {
	  System.out.println("Method to Launch browser.");
  }
  
  @AfterTest
  public void closeBrowser() {
	  System.out.println("Method to close browser.");
  }
}
