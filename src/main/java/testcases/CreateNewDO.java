package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class CreateNewDO extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Create New DO";
		testDescription = "Creating a new Delivery Order";
		category = "Regression";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "CreateNewDO";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String partner, String VehicleNumber, String DriverName, String DispatchedThrough,
			String ShipperReferenceNumber, String Product, String Quantity, String Remarks, String Remarks1) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTradeDocumentManagerMainMenu()
		.clickOnCreateNewdropDown()
		.searchPartner(partner)
		.selectPartner()
		.clickOnEnterDetails()
		.EnterSelectExpectedDeliveryDate()
		.enterVehicleNumber(VehicleNumber)
		.enterDriverName(DriverName)
		.enterDispatchedThrough(DispatchedThrough)
		.enterShipperReferenceNumber(ShipperReferenceNumber)
		.clickOnAddProduct()
		.selectProductFromDropDown(Product)
		.enterQuantity(Quantity)
		.clickOnSubmit()
		.enterRemarks(Remarks)
		.clickOnPreviewDetails()
		.clickOnSubmitDetails()
		.enterRemarks(Remarks1)
		.clickOnSubmitButton()
		.clickOnDeliveryOrdersFromOutGoing()
		.clickOnVIEWlink();
		
}
}
