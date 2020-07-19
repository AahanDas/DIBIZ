package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class OutgoingOrSentPage extends DibizWrappers {

	public OutgoingOrSentPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Outgoing Or Sent Page", "FAIL");
		}

	}
	
	public DeliveryOrderPage clickOnVIEWlink() {
		
		clickByXpath("(//*[contains(text(),'VIEW')])[2]");
		return new DeliveryOrderPage(driver, test);
	}

}
