package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class SourcedBatchDetailsPage  extends DibizWrappers {

	public SourcedBatchDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Sourced Batch Details Page", "FAIL");
		}

	}
	
	public SourcedBatchDetailsPage clickOnUserLogo() {

		clickByXpath("//*[@class='TopNavbarFragments__UserProfile-adzq1e-0 bnwzZQ']");
		return this;
	}
	public LoginPageDibiz clickLogOut() {
		clickByXpath("//*[contains(text(),'Log Out')]");
		return new LoginPageDibiz(driver, test);
	}

}
