package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class AddPartner extends DibizWrappers {

	public AddPartner (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("DIBIZ")) {
			reportStep("This is not Add New Partner Page", "FAIL");
		}
	}
	public AddNewPartner clickOnPlusSymbol() {
		
		clickByXpath("//*[@class='Icon__IconWrapper-w6ayz3-1 biESaQ']");
		return new AddNewPartner(driver, test);
	}

}
