package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPageDibiz;
import wrappers.DibizWrappers;

public class PlantationCreateTicket extends DibizWrappers {

	@BeforeClass
	public void setValue() {
		testCaseName = "CreateTicketPlantation";
		testDescription = "Create Ticket for Plantation";
		category = "smoke";
		authors = "DrD";
		browserName = "chrome";
		dataSheetName = "CreateTicketPlantation";
	}

	@Test(dataProvider = "fetchData")
	public void loginLogOut(String uName, String pwd, String Product, String Harvester, String FFBCount, String Area, String Block,
			String Phase, String unripe, String rotten, String Loose) {
		new LoginPageDibiz(driver, test)
		.enterEmail(uName)
		.enterPassword(pwd)
		.clickSignIn()
		.clickOnTicket()
		.clickOnCreateTicket()
		.searchProduct(Product)
		.SelectProduct()
		.selectHarvester(Harvester)
		.enterFFBCount(FFBCount)
		.enterSelectArea(Area)
		.enterSelectBlock(Block)
		.enterSelectPhase(Phase)
		.enterUnripeBunches(unripe)
		.enterRottenBunches(rotten)
		.enterLooseFruitlets(Loose)
		.clickOnCreate();

	}
}
