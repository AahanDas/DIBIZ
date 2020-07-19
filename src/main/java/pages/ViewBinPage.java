package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewBinPage extends DibizWrappers {

	public ViewBinPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Bin Page", "FAIL");
		}

	}

	public ViewBinPage clickOnMarkAsComplete() {
		clickByXpath("//*[contains(text(),'Mark as Complete')]");

		return this;
	}

	public ViewBinPage clickOnYesinConfirmPopUpPage() {
		clickByXpath("//*[contains(text(),'Yes')]");

		return this;
	}

}
