package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class CreateBinPlantation1 extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "CreateBinPlantation";
		testDescription = "Create Bin for Plantation";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "CreateBinPlantation1";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String VehicleType, String VehicleNumber, String CrewMember, String BinLabel) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnBin()
		.clickOnCreateBin()
		.enterVehicleType(VehicleType)
		.enterVehicleNumber(VehicleNumber)
		.enterCrewMember(CrewMember)
		.enterBinLabel(BinLabel)
		.clickOnTicketNumberCheckBox()
		.clickOnCreate()
		.clickOnMarkAsComplete()
		.clickOnYesinConfirmPopUpPage();

}

}
