package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class UT3_006_SmallHolderCreateWork extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Create Work-Small Holder";
		testDescription = "Smallholder creates work entry and show the work entry in work listing";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "UT3_006";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String productName, String HC, String FFBC, String AreaName, String BlockName,
			String BinName) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnWorkModule()
		.clickOnCreateWork()
		.selectProduct(productName)
		.clickOnSubmitforSelectingProduct()
		.enterTotalHarvesterCount(HC)
		.enterTotalFFBCount(FFBC)
		.checkSubmitButton()
		.enterAreaName(AreaName)
		.enterBlockName(BlockName)
		.enterBinName(BinName)
		.clickOnSubmitButton();

	}

}
