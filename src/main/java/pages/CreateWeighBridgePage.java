package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class CreateWeighBridgePage extends DibizWrappers {

	public CreateWeighBridgePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyTitle("DIBIZ")) {
			reportStep("This is not Create WeighBridge Page", "FAIL");
		}

	}

	public CreateWeighBridgePage selectDOList() {

		clickById("select-drop-activeEntity__input");
		clickByXpath("(//*[@class='StyledText-sc-1sadyjn-0 oKAxv'])[1]");
		return this;
	}

	public CreateWeighBridgePage selectProductSelection() {

		clickById("select-drop-activeProduct__input");
		clickByXpath("(//*[@class='StyledText-sc-1sadyjn-0 oKAxv'])[1]");
		return this;
	}

	public CreateWeighBridgePage clickOnSubmitButton() {

		clickByXpath("(//*[contains(text(), 'Submit')])[2]");
		return this;
	}

	public CreateWeighBridgePage entergrossWeight(String data) {

		enterById("input-grossWeight", data);
		return this;

	}

	public CreateWeighBridgePage entertareWeight(String data) {

		enterById("input-tareWeight", data);
		return this;

	}
	public CreateWeighBridgePage enterticketNumber(String data) {

		enterById("input-ticketNumber", data);
		return this;

	}
	
	public ViewWeighBridgePage clickOnSubmit() {
		
		clickByXpath("//*[contains(text(), 'Submit')]");
		return new ViewWeighBridgePage(driver, test);
	}
	

}
