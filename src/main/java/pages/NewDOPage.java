package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class NewDOPage extends DibizWrappers {

	public NewDOPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not New DO Page", "FAIL");
		}

	}

	public NewDOPage searchPartner(String data) {

		clickByXpath("//*[@name='input-undefined-Search Partner']");
		enterByXpath("//*[@name='input-undefined-Search Partner']", data);
		return this;
	}
	
	public NewDOPage selectPartner() {
		clickByXpath("//*[@class='Label__BaseLabel-z3zd7f-0 fAQTGU']");		
		return this;
	}
	public NewDeliveryOrderDetailsPage clickOnEnterDetails() {
		clickByXpath("//*[contains(text(),'Enter Details')]");
		return new NewDeliveryOrderDetailsPage(driver, test);
		
	}
	

}
