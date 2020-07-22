package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PalmOilMillCreateReportCPOQuality extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "CreateReportCPOQuality";
		testDescription = "Create Report for CPOQuality";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "CreateReportCPOQuality";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String DO, String CPOBatchReference, String FFA, String DOBI,
			String Tank) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnQuality()
		.selectCPOQualityFromCreateReportDropDown()
		.SelectCPOBatchReference(CPOBatchReference)
		.EnterFFA(FFA)
		.EnterDOBI(DOBI)
		.SelectChooseTank(Tank)
		.clickOnCommonCreateButton();
		
	}
}
