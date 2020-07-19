package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ProductionPage extends DibizWrappers {

	public ProductionPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Production Page", "FAIL");
		}

	}

	public CreatePlotInputPage clickOnPlotInput() {
		
		clickByXpath("//*[contains(text(), 'Plot Input')]");
		
		return new CreatePlotInputPage(driver, test);
	}

}
