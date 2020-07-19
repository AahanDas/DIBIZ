package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class UT3_006_SmallHolderEditWork extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Edit Work-Small Holder";
		testDescription = "Smallholder Edit work entry and show the updated work entry in work listing";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "UT3_006_01";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String updateHC, String updateFFBC, 
			String updateAreaName, String updateBlockName, String updateBinName) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWorkModule()
		.clickOnVIEW()
		.clickOnEdit()
		.updateTotalHarvesterCount(updateHC)
		.updateTotalFFBCount(updateFFBC)
		.updateAreaName(updateAreaName)
		.updateBlockName(updateBlockName)
		.updateBinName(updateBinName)
		.clickOnSubmitButton();
		

}
}
