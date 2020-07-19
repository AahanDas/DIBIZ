package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class WeighBridgePage extends DibizWrappers {

	public WeighBridgePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("DIBIZ")) {
			reportStep("This is not WeighBridge Page", "FAIL");
		}

	}

	public CreateWeighBridgePage clickOnCreateSlip() {

		clickByXpath("//*[contains(text(), 'Create Slip')]");
		return new CreateWeighBridgePage(driver, test);
	}

	public ViewWeighBridgePage clickOnVIEW() {

		clickByXpath("(//*[contains(text(), 'VIEW')])[1]");
		return new ViewWeighBridgePage(driver, test);
	}

}
