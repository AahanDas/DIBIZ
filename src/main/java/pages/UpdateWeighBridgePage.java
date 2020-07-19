package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class UpdateWeighBridgePage extends DibizWrappers {

	public UpdateWeighBridgePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("DIBIZ")) {
			reportStep("This is not Update WeighBridge Page", "FAIL");
		}

	}

	public UpdateWeighBridgePage entergrossWeight(String data) {

		enterById("input-grossWeight", data);
		return this;

	}

	public UpdateWeighBridgePage entertareWeight(String data) {

		enterById("input-tareWeight", data);
		return this;

	}

	public UpdateWeighBridgePage enterticketNumber(String data) {

		enterById("input-ticketNumber", data);
		return this;

	}

	public ViewWeighBridgePage clickOnSubmit() {

		clickByXpath("//*[contains(text(), 'Submit')]");
		return new ViewWeighBridgePage(driver, test);
	}

}
