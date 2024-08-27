package pageobjectmodeljat21;

import org.testng.annotations.Test;

import base.ProjectsSpecificMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC004_TestDemo extends ProjectsSpecificMethod {
	
	
	  @Test(priority=1,dependsOnMethods ="Signup",description = "This is login method")
	  public void Login() {
		  System.out.println("login method");
	  }
	  
	  
	  @Test(priority=1,dependsOnMethods ="Homepage",description = "This is Signup  method")
	  public void Signup() {
		  System.out.println("signup method");

	  }
	  
	  @Test(dependsOnMethods ="Login",description = "This is Add product to cart method")
	  public void Cartadd() {
		  System.out.println("Cart adding method");

	  }
	 
	 
	  @Test(description = "This is Homepage method" )
	  public void Homepage() {
		  System.out.println("Home page method");

	  }
	  
	  @Test(dependsOnMethods = "Cartadd",description = "This is Logout method")
	  public void Logout() {
		  System.out.println("Logout method");

	  }
	  
//	  @Test(expectedExceptions = ArithmeticException.class)
//	  public void exceptionTest() {
//		 int result=10/0;//arithmetic exception
//		 
//	  }
	  
	  
	
}
