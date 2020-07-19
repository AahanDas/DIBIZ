package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class BinsPage extends DibizWrappers {

	public BinsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Bins Page", "FAIL");
		}

	}
	
	public createBinPage clickOnCreateBin() {
		
		clickByXpath("//*[contains(text(),'CREATE BIN')]");
		return new createBinPage(driver, test);
	}

}
