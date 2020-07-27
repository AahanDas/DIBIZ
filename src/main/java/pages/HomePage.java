package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class HomePage extends DibizWrappers {

	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not Home Page", "FAIL");
		}

	}

	public HomePage clickOnUserLogo() {

		clickByXpath("//*[@class='TopNavbarFragments__UserProfile-adzq1e-0 bNdfRr']");
		return this;
	}

	public LoginPageDibiz clickLogOut() {
		clickByXpath("//*[contains(text(),'Log Out')]");
		return new LoginPageDibiz(driver, test);
	}

	public WorkListingPage clickOnWorkModule() {
		clickByXpath("(//*[contains(text(),'Work')])[1]");
		return new WorkListingPage(driver, test);

	}

	public PartnerPage clickPartnerModule() {
		clickByXpath("//*[contains(text(),'Partner Management')]");
		return new PartnerPage(driver, test);

	}

	public TDMPage clickOnTradeDocumentManagerMainMenu() {
		clickByXpath("(//*[contains(text(),'Trade Document Manager')])[1]");
		return new TDMPage(driver, test);

	}

	public WeighBridgePage clickOnWeighBridgeMainMenu() {

		clickByXpath("//*[contains(text(), 'WeighBridge')]");
		return new WeighBridgePage(driver, test);
	}

	public TicketsPage clickOnTicket() {
		clickByXpath("//*[contains(text(), 'Ticket')]");
		return new TicketsPage(driver, test);

	}

	public BinsPage clickOnBin() {
		clickByXpath("//*[contains(text(), 'Bin')]");
		return new BinsPage(driver, test);

	}

	public QualityPage clickOnQuality() {

		clickByXpath("//*[contains(text(), 'Quality')]");
		return new QualityPage(driver, test);

	}

	public ProductionPage clickOnProduction() {

		clickByXpath("//*[contains(text(), 'Production')]");
		return new ProductionPage(driver, test);

	}

	public HomePage verifyFeedBackSuccessMessage(String data) {
		verifyTextByXpath("//*[contains(text(), 'Feedback Submitted')]", data);

		return this;
	}

	public FeedbackPage clickOnFeedbackFromMenu() {

		clickByXpath("//*[contains(text(),'Feedback')]");
		return new FeedbackPage(driver, test);
	}

	public AuditReportPage clickOnAuditReportsFromMenu() {

		clickByXpath("//*[contains(text(),'Audit Reports')]");
		return new AuditReportPage(driver, test);
	}
	
	public ProductTracePage clickOnProductTraceFromMenu() {
		clickByXpath("//*[contains(text(),'Product Trace')]");
		return new ProductTracePage(driver, test);
		
		
	}

}
