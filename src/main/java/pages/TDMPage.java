package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class TDMPage extends DibizWrappers {

	public TDMPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not TDM Page", "FAIL");
		}

	}

	public NewDOPage clickOnCreateNewdropDown() {
		clickByXpath("//*[contains(text(),'CREATE NEW')]");
		clickByXpath("//*[contains(text(),'DELIVERY ORDER')]");
		
		//selectVisibileTextByXPath("//*[contains(text(),'CREATE NEW')]", "DELIVERY ORDER");
		return new NewDOPage(driver, test);
	}

}
