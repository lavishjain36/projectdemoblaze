package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectsSpecificMethod;

//import base.ProjectsSpecificMethod;

public class LoginPage extends ProjectsSpecificMethod {
	
	@FindBy(xpath="//button[@onclick=\"logIn()\"]")
	WebElement login;

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	//Method-LoginUsername
	
	public LoginPage loginuserName(String username) {
		findElementsAndSendkeys("loginusername", username);
		return this;
	}
	
	//Method-Loginpasword
	public LoginPage loginpassword(String password) {
		findElementsAndSendkeys("loginpassword", password);
		return this;
	}
	
	//Method-Click loginbutton
	public LoginPage logInButton() {
		login.click();
		return this;
	}

}
