package pageobjectmodeljat21;

import org.testng.annotations.Test;

import base.ProjectsSpecificMethod;

public class TC006_TestGroup extends ProjectsSpecificMethod {
	
  @Test(priority = 1,groups = "group1")
  public void login() {
	 System.out.println("Login Method Executed...");
  }
 
  @Test(priority = 3,groups = "group3")
  public void logout() {
		 System.out.println("Logout Method Executed...");
  }
  
  
  @Test(priority = 2,groups = {"group1","group2","group3"} )
  public void createadmin() {
		 System.out.println("CreateAdmin Method Executed...");

  }
  
  @Test(priority = 2,groups = "group1")
  public void createCustomer() {
		 System.out.println("CreateCustomer Method Executed...");
  }
}
