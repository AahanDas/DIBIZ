package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class DeleteWorkSmallHolder  extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Delete Work SmallHolder";
		testDescription = "Delete Work Detail for Small Holder";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "DeleteWorkSmallHolder";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWorkModule()
		.clickOnVIEW()
		.clickOnDelete()
		.clickonYes();
		

	}
}
