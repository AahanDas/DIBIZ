package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class CPOQualityReportPage extends DibizWrappers {

	public CPOQualityReportPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not CPOQualityReport Page", "FAIL");
		}

	}
	
	public QualityPage  clickOnSeeAllReportsButton() {
		
		clickByXpath("//*[contains(text(),'See All Reports')]");
		return new QualityPage(driver, test);
	}
	

}
