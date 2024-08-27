package pageobjectmodeljat21;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.ProjectsSpecificMethod;

public class TC007_EmployeeTest extends ProjectsSpecificMethod {
	
  @Test(priority=1,groups = {"smoke","regression"})
  @Parameters({"empname","empid"})
  public void createEmployee(String name,String id) {
	  System.out.println("Executing Creating an employee Test");
	  System.out.println("Employee Name :"+name+", ID "+id);
  }
  
  @Test(priority=2,groups = {"regression"})
  public void updatEmployee() {
	  System.out.println("Executing Updating an employee Test");

  }
  
  @Test(priority=3,groups = {"regression","critical"})
  public void deleteEmployee() {
	  System.out.println("Executing Delete an employee Test");

  }
  
  @Test(priority=4,groups = {"smoke","regression"})
  public void getEmployeeDetails() {
	  System.out.println("Getting all an employee ");

  }
  
  
}
