package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewWeighBridgePage extends DibizWrappers {

	public ViewWeighBridgePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("DIBIZ")) {
			reportStep("This is not View Weigh Bridge Page", "FAIL");
		}

	}
	public UpdateWeighBridgePage clickOnEDITWEIGHBRIDGE() {
		
		clickByXpath("//*[contains(text(), 'EDIT WEIGHBRIDGE')]");
		return new UpdateWeighBridgePage(driver, test);
	}
	
}
