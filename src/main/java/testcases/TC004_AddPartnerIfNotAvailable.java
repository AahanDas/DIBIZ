package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class TC004_AddPartnerIfNotAvailable extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "AddPartner";
		testDescription = "Add a new Partner";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "TC004";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String OrgName, String OrgType, String Loc, String PhoneNo, String Email) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickPartnerModule()
		.clickOnAddPartner()
		.clickOnPlusSymbol()
		.enterOrgnisationName(OrgName)
		.selectOrgnisationType(OrgType)
		.enterLocation(Loc)
		.enterPhoneNumber(PhoneNo)
		.enterEmailId(Email)
		.clickOnSubmitButton()
		.clickOnProceedButton()
		.clickOnOKButton();
		
}
}
