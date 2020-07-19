package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class TC001_LoginLogOut extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Login & LogOut";
		testDescription = "Login and Logout of DIBIZ";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "TC001";
		//headless = "yes";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnUserLogo()
		.clickLogOut();

	}

}
