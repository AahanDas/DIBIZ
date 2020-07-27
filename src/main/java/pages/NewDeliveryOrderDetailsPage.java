package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class NewDeliveryOrderDetailsPage extends DibizWrappers {

	public NewDeliveryOrderDetailsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not New Delivery Order Details Page", "FAIL");
		}

	}

	public NewDeliveryOrderDetailsPage EnterSelectExpectedDeliveryDate() {
		
		clickById("date-picker-expectedDate-id");
		clickByXpath("(//*[@class='flatpickr-next-month'])[2]");
		clickByXpath("(//*[@class='flatpickr-day '])[31]");
		return this;
	}

	public NewDeliveryOrderDetailsPage enterVehicleNumber(String data) {
		enterById("input-vehicleNumber", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage enterDriverName(String data) {
		enterById("input-driverName", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage enterDispatchedThrough(String data) {
		enterById("input-shipThrough", data);

		return this;
	}

	public NewDeliveryOrderDetailsPage enterShipperReferenceNumber(String data) {
		enterById("input-shipperNumber", data);

		return this;
	}
	
	public NewDeliveryOrderDetailsPage clickOnAddProduct() {
		clickByXpath("//*[contains(text(),'Add Products')]");

		return this;
	}
	public NewDeliveryOrderDetailsPage selectProductFromDropDown(String data) {
		clickById("select-drop-productSelection__input");
		enterByXpath("//*[@type='search']", data);
		clickByXpath("//*[@class='StyledText-sc-1sadyjn-0 oKAxv']");
		return this;
	}
	public NewDeliveryOrderDetailsPage enterQuantity(String data) {
		enterById("input-quantity", data);

		return this;
	}
	public NewDeliveryOrderDetailsPage clickOnSubmit() {
		clickByXpath("//*[contains(text(),'Submit')]");
		

		return this;
	}
	public NewDeliveryOrderDetailsPage enterRemarks(String data) {
		enterById("input-remarks", data);

		return this;
	}
	public NewDeliveryOrderConfirmPage clickOnPreviewDetails() {
		
		clickByXpath("//*[contains(text(),'Preview Details')]");
		return new NewDeliveryOrderConfirmPage(driver, test);
	}
	
	
	
	

}
