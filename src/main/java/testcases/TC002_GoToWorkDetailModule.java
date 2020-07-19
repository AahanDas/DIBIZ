package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class TC002_GoToWorkDetailModule extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "GoToWorkDetailModule";
		testDescription = "WorkDetailModule";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "TC001";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWorkModule()
		.clickOnUserLogo()
		.clickLogOut();
	}
	
}