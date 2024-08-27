package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectsSpecificMethod;

public class SignupPage extends ProjectsSpecificMethod {


	
//locate all the objects
	@FindBy(id="signin2")
	WebElement signupbtn1;
	
	@FindBy(id="sign-username")
	WebElement signupusernamefield;
	
	@FindBy(id="sign-password")
	WebElement signupuserpasswordfield;

	@FindBy(xpath="//*[@onclick='register()']")
	WebElement signupbtnregisstrationformfield;

	
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//method fill the username using 
	public SignupPage signupUsername(String username) {
		findElementsAndSendkeys("sign-username", username);
		return this;
		
	}
	
	//method fill the username using 
	public SignupPage signupPassword(String password) {
		findElementsAndSendkeys("sign-password", password);
		return this;
		
	}
	
	//method for click on button
	public SignupPage signupButton() {
		signupbtnregisstrationformfield.click();
		return this;
	}

}
