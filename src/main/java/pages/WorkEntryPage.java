package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class WorkEntryPage extends DibizWrappers {

	public WorkEntryPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Work Entry Page", "FAIL");
		}

	}
	
	public WorkDetails clickOnEdit() {
		
		clickByXpath("//*[contains(text(),'Edit')]");
		return new WorkDetails(driver, test);
	}
	
	public WorkEntryPage clickOnDelete() {
		clickByXpath("//*[contains(text(),'Delete')]");
		return this;
		
	}
	
	public WorkListingPage clickonYes() {
		clickByXpath("//*[contains(text(),'Yes')]");
		return new WorkListingPage(driver, test);
		
	}

}
