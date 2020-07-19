package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class CreateTicketPage extends DibizWrappers {

	public CreateTicketPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Create Ticket Page", "FAIL");
		}

	}
	
	public CreateTicketPage searchProduct(String data) {
		
		clickByXpath("//*[@class='StyledIcon-ofa7kd-0 cBvDlm']");
		//enterByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']", data);
		enterByXpath("//*[@type='search']", data);
		return this;
	}

	public CreateTicketPage SelectProduct() {

		/*
		 * //clickByXpath("//*[@class='StyledButton-sc-323bzc-0 kaBBoa']"); //
		 * clickById("select-drop-productID__input");
		 * clickByXpath("//*[@class='StyledIcon-ofa7kd-0 cBvDlm']");
		 * clickByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']");
		 * enterByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']", data);
		 */
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		clickByXpath("//*[contains(text(),'Submit')]");
		
				

		return this;

	}

	public CreateTicketPage selectHarvester(String data) {
		clickByXpath("//*[@class='StyledIcon-ofa7kd-0 cBvDlm']");
		//clickByXpath("//*[@class='StyledTextInput-sc-1x30a0s-0 bkOazG']");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");

		return this;
	}

	public CreateTicketPage enterFFBCount(String data) {
		enterById("input-ffbCount", data);
		return this;
	}

	public CreateTicketPage enterSelectArea(String data) {
		enterById("input-area", data);
		return this;
	}

	public CreateTicketPage enterSelectBlock(String data) {
		enterById("input-block", data);

		return this;
	}

	public CreateTicketPage enterSelectPhase(String data) {
		enterById("input-phase", data);

		return this;
	}

	public CreateTicketPage enterUnripeBunches(String data) {
		enterById("input-unripe", data);

		return this;
	}

	public CreateTicketPage enterRottenBunches(String data) {
		enterById("input-rotten", data);

		return this;
	}

	public CreateTicketPage enterLooseFruitlets(String data) {
		enterById("input-loose", data);
		return this;
	}

	public ViewTicketPage clickOnCreate() {
		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']");
		return new ViewTicketPage(driver, test);
	}

}
