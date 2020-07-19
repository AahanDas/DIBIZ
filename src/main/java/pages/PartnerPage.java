package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class PartnerPage extends DibizWrappers {

	public PartnerPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Partner Page", "FAIL");
		}
	}
	
	public AddPartner clickOnAddPartner() {
		clickByXpath("//*[contains(text(),'Add Partner')]");
		return new AddPartner(driver, test);
	}
}
