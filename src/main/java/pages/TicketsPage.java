package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class TicketsPage extends DibizWrappers {

	public TicketsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Tickets Page", "FAIL");
		}

	}
	public CreateTicketPage clickOnCreateTicket() {
		clickByXpath("//*[contains(text(), 'CREATE TICKET')]");
		
		return new CreateTicketPage(driver, test);
	}

}
