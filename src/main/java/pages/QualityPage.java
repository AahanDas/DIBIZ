package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class QualityPage extends DibizWrappers {

	public QualityPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Quality Page", "FAIL");
		}

	}

	public QualityPage selectFFBQualityFromCreateReportDropDown() {
		clickByXpath("//*[contains(text(),'CREATE REPORT')]");
		clickByXpath("//*[contains(text(),'FFB QUALITY')]");
		return this;
	}
	
	

	public QualityPage selectDOList(String data) {
		clickById("select-drop-DO List__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");

		return this;
	}

	public QualityPage selectProductSelection(String data) {
		clickById("select-drop-Product Selection__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");

		return this;
	}
	public QualityCreatePage clickOnSubmitButton() {
		clickByXpath("//*[contains(text(),'Submit')]");
		return new QualityCreatePage(driver, test);
		
	}
	public CPOQualityDetailsPage selectCPOQualityFromCreateReportDropDown() {
		clickByXpath("//*[contains(text(),'CREATE REPORT')]");
		clickByXpath("//*[contains(text(),'CPO QUALITY')]");
		return new CPOQualityDetailsPage(driver, test);
	}
	

}
