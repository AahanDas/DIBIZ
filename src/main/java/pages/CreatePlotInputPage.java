package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class CreatePlotInputPage extends DibizWrappers {

	public CreatePlotInputPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not CreatePlotInput Page", "FAIL");
		}

	}

	public CreatePlotInputPage selectChooseProduct(String data) {
		clickById("select-drop-productID__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;

	}

	public CreatePlotInputPage selectCheckBoxOfConsignmentNumber() {

		clickByXpath(
				"(//*[@class='StyledBox-sc-13pk1d4-0 PiYIl StyledCheckBox__StyledCheckBoxBox-sc-1dbk5ju-3 cJNjzg'])[1]");
		return this;

	}

	public CreatePlotInputPage enterQuantityUsed(String data) {
		enterById("input-quantity-entity-delivery-order-JiIR2T8VUciejpik", data);

		return this;
	}

	public CreatePlotInputPage enterProductionLine(String data) {
		enterById("input-production-entity-delivery-order-JiIR2T8VUciejpik", data);

		return this;
	}

	// after clicking on Submit button system goes to Home page which is wrong, it
	// should go to other page.

	public SourcedBatchDetailsPage clickOnSubmit() {
		clickByXpath("//*[contains(text(),'Submit')]");
		return new SourcedBatchDetailsPage(driver, test);

	}
	public CreatePlotInputPage clickOnUserLogo() {

		clickByXpath("//*[@class='TopNavbarFragments__UserProfile-adzq1e-0 bNdfRr']");
		return this;
	}
	public LoginPageDibiz clickLogOut() {
		clickByXpath("//*[contains(text(),'Log Out')]");
		return new LoginPageDibiz(driver, test);
	}

}
