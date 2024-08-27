package base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.Utility;

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
	  
	  //method to read the data from an excel
	  @DataProvider(name="ReadfromExcel")
	  public String[][] excelRead() throws IOException{
		String[][] data=  readExcel(excelFile,sheetName);
		return data;
	  }
	  
	  

}
