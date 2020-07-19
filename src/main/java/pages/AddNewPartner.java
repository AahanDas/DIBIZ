package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class AddNewPartner extends DibizWrappers {

	public AddNewPartner(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Add New Partner Page", "FAIL");
		}
	}

	public AddNewPartner enterOrgnisationName(String OrgName) {
		enterById("input-name", OrgName);

		return this;
	}

	public AddNewPartner selectOrgnisationType(String OrgType) {
		// selectVisibileTextByXPath("//*[contains(text(), 'FFB Dealer')]", OrgType);
		clickById("select-drop-orgType__input");
		clickByXpath("//*[contains(text(), 'FFB Dealer')]");

		return this;
	}

	public AddNewPartner enterLocation(String Loc) {
		enterById("input-location", Loc);
		return this;
	}

	public AddNewPartner enterPhoneNumber(String PhoneNo) {
		enterById("input-mobile", PhoneNo);

		return this;
	}

	public AddNewPartner enterEmailId(String Email) {
		enterById("input-email", Email);

		return this;
	}

	public AddNewPartner clickOnSubmitButton() {

		clickByXpath("//*[contains(text(), 'Submit')]");

		return this;
	}

	public AddNewPartner clickOnProceedButton() {
		clickByXpath("//*[contains(text(), 'Proceed')]");

		return this;
	}

	public PartnerPage clickOnOKButton() {
		clickByXpath("//*[contains(text(), 'OK')]");

		return new PartnerPage(driver, test);
	}

}
