package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class CPOQualityDetailsPage extends DibizWrappers {

	public CPOQualityDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not CPOQuality Details Page", "FAIL");
		}

	}

	public CPOQualityDetailsPage SelectCPOBatchReference(String data) {
		clickById("select-drop-cpobatchreference__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");

		return this;

	}

	public CPOQualityDetailsPage EnterFFA(String data) {

		enterById("input-ffa", data);

		return this;
	}
	public CPOQualityDetailsPage EnterDOBI(String data) {
		enterById("input-dobi", data);
		
		return this;
	}
	
	public CPOQualityDetailsPage SelectChooseTank(String data) {
		clickById("select-drop-storageTank__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
	}
	
	public CPOQualityReportPage clickOnCommonCreateButton() {
		clickByXpath("//*[contains(text(),'common.create')]");
		return new CPOQualityReportPage(driver, test);
		
	}

}
