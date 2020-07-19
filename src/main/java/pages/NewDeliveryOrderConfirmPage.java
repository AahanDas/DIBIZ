package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class NewDeliveryOrderConfirmPage extends DibizWrappers {

	public NewDeliveryOrderConfirmPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not New Delivery Order Confirm Page", "FAIL");
		}

	}
	//need to update on landing page
	public DeliveryOrderPage clickOnSubmitDetails() {
		
		clickByXpath("//*[contains(text(),'Submit Details')]");
		return new DeliveryOrderPage(driver, test);
	}
}
