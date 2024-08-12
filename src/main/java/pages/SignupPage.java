package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectsSpecificMethod;

public class SignupPage extends ProjectsSpecificMethod {

	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//locate all the objects
	@FindBy(id="signin2")
	WebElement signupbtn1;
	
	@FindBy(id="sign-username")
	WebElement signupusernamefield;
	
	@FindBy(id="sign-password")
	WebElement signupuserpasswordfield;

	@FindBy(xpath="//*[@onclick='register()']")
	WebElement signupbtnregisstrationformfield;

	
	public void clickSignupLandingPageBtn() {
		signupbtn1.click();
	}
	
	
	public void enterSignupusername(String username) {
		signupusernamefield.sendKeys(username);
	}
	
	public void enterSignupuserpassword(String password) {
		signupuserpasswordfield.sendKeys(password);
	}
	     
	
	public void clickSignupregistrationbtn() {
		signupbtnregisstrationformfield.click();
	}
	

}
