package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class ViewTicketPage extends DibizWrappers {

	public ViewTicketPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not View Ticket Page", "FAIL");
		}

	}
	public HomePage clickOnHomeFromNavigation() {
		
		clickByXpath("(//*[contains(text(), 'Home')])[1]");
		return new HomePage(driver, test);
	}
	

}
