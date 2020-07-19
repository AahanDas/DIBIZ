package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class UpdateWeighBridge extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Edit WeighBridge";
		testDescription = "Update a WeighBridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "UpdateWeighBridge";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String grossWeight, String tareWeight, String ticketNumber) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWeighBridgeMainMenu()
		.clickOnVIEW()
		.clickOnEDITWEIGHBRIDGE()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();
		

}
}
