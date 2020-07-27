package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationProductionCreatePlotInput extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "Production CreatePlotInput for Plantation";
		testDescription = "Production- Create PlotInput";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "ProductionCreatePlotInput";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String product, String QuantityUsed, String ProductionLine) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnProduction()
		.clickOnPlotInput()
		.selectChooseProduct(product)
		.selectCheckBoxOfConsignmentNumber()
		.enterQuantityUsed(QuantityUsed)
		.enterProductionLine(ProductionLine)
		.clickOnSubmit()
		.clickOnUserLogo()
		.clickLogOut();

}
}
