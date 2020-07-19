package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class QualityCreatePage extends DibizWrappers {

	public QualityCreatePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Quality Create Page", "FAIL");
		}

	}

	public QualityCreatePage enterNumberOfRipeBunches(String data) {
		enterById("input-ripe", data);

		return this;
	}

	public QualityCreatePage enterNumberOfOverRipeBunches(String data) {
		enterById("input-overRipe", data);

		return this;
	}

	public QualityCreatePage enterNumberOfUnderRipeBunches(String data) {
		enterById("input-underRipe", data);

		return this;
	}

	public QualityCreatePage enterNumberOfEmptyBunches(String data) {
		enterById("input-empty", data);

		return this;
	}
	public QualityPage clickOnCreate() {
		clickByXpath("(//*[contains(text(),'Create')])[2]");
		return new QualityPage(driver, test);
	}

}
