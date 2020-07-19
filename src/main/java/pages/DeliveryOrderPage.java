package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class DeliveryOrderPage extends DibizWrappers {

	public DeliveryOrderPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Delivery Order Page", "FAIL");
		}

	}
	
	public DeliveryOrderPage enterRemarks(String data) {
		
		enterById("input-remarks", data);
		return this;
	}
	
	public DeliveryOrderPage clickOnSubmitButton() {
		clickByXpath("(//*[contains(text(),'Submit')])[2]");
		return this;
		
	}
	public OutgoingOrSentPage clickOnDeliveryOrdersFromOutGoing() {
		
		clickByXpath("(//*[contains(text(),'Delivery Orders')])[2]");
		return new OutgoingOrSentPage(driver, test);
	}
	
	
}
