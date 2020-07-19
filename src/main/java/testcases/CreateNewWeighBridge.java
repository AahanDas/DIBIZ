package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class CreateNewWeighBridge extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Create New WeighBridge";
		testDescription = "Create a New WeighBridge";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "CreateNewWeighBridge";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String grossWeight, String tareWeight, String ticketNumber) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWeighBridgeMainMenu()
		.clickOnCreateSlip()
		.selectDOList()
		.selectProductSelection()
		.clickOnSubmitButton()
		.entergrossWeight(grossWeight)
		.entertareWeight(tareWeight)
		.enterticketNumber(ticketNumber)
		.clickOnSubmit();
}
}
