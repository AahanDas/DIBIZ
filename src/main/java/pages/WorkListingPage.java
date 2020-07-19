package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class WorkListingPage extends DibizWrappers {

	public WorkListingPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Work Listing Page", "FAIL");
		}
	}

	public WorkListingPage clickOnUserLogo() {

		clickByXpath("//*[@class='TopNavbarFragments__UserProfile-adzq1e-0 bNdfRr']");
		return this;
	}

	public LoginPageDibiz clickLogOut() {
		clickByXpath("//*[contains(text(),'Log Out')]");
		return new LoginPageDibiz(driver, test);
	}
	
	public WorkDetails clickOnCreateWork() {
		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']");
		return new WorkDetails(driver, test);
		
		
	}
	public WorkEntryPage clickOnVIEW() {
		
		clickByXpath("(//*[contains(text(),'VIEW')])[1]");
		return new WorkEntryPage(driver, test);
		
	}

	/*
	 * public WorkListingPage enterTotalHarvesterCount(String data) {
	 * enterById("input-harvesterCount", data); return this;
	 * 
	 * } public WorkListingPage enterTotalFFBCount(String data) {
	 * enterById("input-ffbCount", data); return this;
	 * 
	 * } public WorkListingPage enterAreaName(String data) { enterById("input-area",
	 * data); return this;
	 * 
	 * } public WorkListingPage enterBlockName(String data) {
	 * enterById("input-block", data); return this;
	 * 
	 * } public WorkListingPage enterBinName(String data) { enterById("input-bin",
	 * data); return this;
	 * 
	 * }
	 * 
	 * public WorkListingPage checkSubmitButton() { Assert.assertTrue(driver.
	 * findElementByXPath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']").isEnabled
	 * ()); return this;
	 * 
	 * }
	 * 
	 * public WorkEntryPage clickOnSubmitButton() {
	 * 
	 * clickByClassName("StyledButton-sc-323bzc-0 edaVNT"); return new
	 * WorkEntryPage(driver, test); }
	 */
	

}
