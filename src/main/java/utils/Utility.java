package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	//driver instance
	public static WebDriver driver;
	
	public Utility() {
		// TODO Auto-generated constructor stub
	}
	//method to launch browser and load url
	public void launchBrowser(String browser,String url) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}else if(browser.equals("edge")) {
			driver=new EdgeDriver();
		
	   }else {
		   driver=new ChromeDriver();
	   }
		
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

   }
	
	//close the browser
	public void closeBrowser() {
		driver.close();
	}
	
	//click operation
	public void click(WebElement ele) {
		ele.click();
	}
	//find an element and send keys together
	public void findElementsAndSendkeys(String attributeValue,String value) {
		driver.findElement(By.id(attributeValue)).sendKeys(value);
	}
	
	
	//explict wait  for element visibility 
	public void visibilityofElement(WebElement element,int sec) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//method for reading data from excel.
	//method capturing screenshot-TakeScreenshot
	
}