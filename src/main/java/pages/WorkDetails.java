package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class WorkDetails extends DibizWrappers {

	public WorkDetails(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Work Entry Page", "FAIL");
		}

	}
	
	public WorkDetails selectProduct(String data) {
		clickById("select-drop-productID__input");
		//enterByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
		
	}
	
	public WorkDetails clickOnSubmitforSelectingProduct() {
		
		clickByXpath("//*[contains(text(),'Submit')]");
		return this;
		
		
	}
	
	public WorkDetails enterTotalHarvesterCount(String data) {
		enterById("input-harvesterCount", data);
		return this;

	}
	public WorkDetails enterTotalFFBCount(String data) {
		enterById("input-ffbCount", data);
		return this;

	}
	public WorkDetails enterAreaName(String data) {
		enterById("input-area", data);
		return this;

	}
	public WorkDetails enterBlockName(String data) {
		enterById("input-block", data);
		return this;

	}
	public WorkDetails enterBinName(String data) {
		enterById("input-bin", data);
		return this;

	}
	
	public WorkDetails updateTotalHarvesterCount(String updateData) {
		enterById("input-harvesterCount", updateData);
		return this;

	}
	
	public WorkDetails updateTotalFFBCount(String updateData) {
		
		enterById("input-ffbCount", updateData);
		return this;
	}
	
	public WorkDetails updateAreaName(String updatedata) {
		enterById("input-area", updatedata);
		return this;

	}
	public WorkDetails updateBlockName(String updatedata) {
		enterById("input-block", updatedata);
		return this;

	}
	public WorkDetails updateBinName(String updatedata) {
		enterById("input-bin", updatedata);
		return this;

	}
	
	
	
	
	public WorkDetails checkSubmitButton() {
		Assert.assertTrue(driver.findElementByXPath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']").isEnabled());
		return this;
		
	}
	
	public WorkEntryPage clickOnSubmitButton() {
		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']");
		
		return new WorkEntryPage(driver, test);
	}

}