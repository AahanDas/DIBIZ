package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class CreateWorkSmallHolder extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Create Work SmallHolder";
		testDescription = "Submit Work Detail for Small Holder";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "TC003";
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
		

				/*.checkSubmitButton()*/.enterTotalHarvesterCount(HC).enterTotalFFBCount(FFBC)/* .checkSubmitButton() */
				.enterAreaName(AreaName).enterBlockName(BlockName).enterBinName(BinName).clickOnSubmitButton();

	}
}
