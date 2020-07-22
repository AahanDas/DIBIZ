package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class LoginPageDibiz extends DibizWrappers {

	public LoginPageDibiz(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Login Page", "FAIL");
		}
	}

	public LoginPageDibiz enterEmail(String data) {

		enterById(prop.getProperty("Login.UserName.Id"), data);
		return this;
	}

	public LoginPageDibiz enterPassword(String data) {
		enterByName(prop.getProperty("Login.Password.Name"), data);
		return this;
	}

	public HomePage clickSignIn() {
		clickByXpath(prop.getProperty("Login.SignIn.Xpath"));
		return new HomePage(driver, test);
	}

	public LoginPageDibiz clickLoginforFailure() {
		clickByClassName("decorativeSubmit");
		/*
		 * HomePage hp = new HomePage(); return hp;
		 */
		return this;
	}

	public LoginPageDibiz verifyLoginDetails(String text) {
		verifyTextContainsById("errorDiv", text);
		return this;
	}
	
	
	


}
