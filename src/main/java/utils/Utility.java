package utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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

	//instance for excel 
	public String excelFile;

	//instance fo sheet 
	public String sheetName;


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

	public String[][] readExcel(String excelfile,String sheetname) throws IOException{
		XSSFWorkbook book=new XSSFWorkbook(
				"D:\\JavaConcept\\pageobjectmodeljat21\\Data\\"+excelfile+".xlsx");

		XSSFSheet sheet=book.getSheet(sheetname);

		//Get the row and coulmn count
		int rowCount=sheet.getLastRowNum();
		int columnCount=sheet.getRow(0).getLastCellNum();

		//2-d array to store row and column values of cells
		String[][] data=new String[rowCount][columnCount];

		//get into rows
		for(int i=1;i<=rowCount;i++) {
			XSSFRow row=sheet.getRow(i);
			//get into columns
			for(int j=0;j<columnCount;j++) {
				//get over cells
				XSSFCell cell=row.getCell(j);
				//cell value
				data[i-1][j]  =cell.getStringCellValue(); 
			}

		}
		//close the work book 
		book.close();
		return data;

	}


	//generate random username for signup functionality
	public String randomNameGenerator() {
		//create string all character

		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//create an object of String builder
		StringBuilder sb=new StringBuilder();
		//create a Random class object
		Random random=new Random();


		int length=7;

		for(int i=0;i<length;i++) {
			//generate random index number
			int index=random.nextInt(alphabet.length());

			//get the character based on abov index
			char randomChar	=alphabet.charAt(index);

			sb.append(randomChar);
		}
		String name=sb.toString();
		System.out.println("The random string is "+name);
		return name;

	}

	//method capturing screenshot-TakeScreenshot

//	public String takeScreenshot(String screenshotName) throws IOException {
//		Date d=new Date();
//		String date=d.toString();
//		System.out.println(date);
//		//logic
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String time=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
//		String path="D:\\JavaConcept\\pageobjectmodeljat21\\ScreenShot\\"+screenshotName+"_"+time+".png";
//		File des=new File(path);
//		FileUtils.copyFile(src, des);
//		return path;
//	}
	
	public String takeScreenshot(String screenshotName) throws IOException {
		Date d = new Date();
		String date = d.toString();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		String path="D:\\JavaConcept\\pageobjectmodeljat21\\ScreenShot\\"+ screenshotName + "_" + time + ".png";
//		String path=System.getProperty("user.dir")+"\\Screenshots\\"+ screenshotName + "_" + time + ".png";
		System.out.println("Screenshot" +path);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
		return path;
	}


}