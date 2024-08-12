package base;

import org.testng.annotations.Test;

import utils.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;

public class ProjectsSpecificMethod extends Utility{
	
  //parameter to ensure browser and take chrome 
  @Parameters({"browser","url"})
  @BeforeMethod
  public void browserLaunch(String browser,String url) {
	  launchBrowser(browser, url);
  }
 
  @AfterMethod
  public void browserClose() {
	  closeBrowser();
  }
  
  //data driven testing
  

}
