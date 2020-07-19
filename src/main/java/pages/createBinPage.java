package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.DibizWrappers;

public class createBinPage extends DibizWrappers {

	public createBinPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;

		if (!verifyDynamicTitle("DIBIZ")) {
			reportStep("This is not create Bin Page", "FAIL");
		}

	}
	public createBinPage enterVehicleType(String data) {
		enterById("input-vehicleType", data);
		return this;
	}
	public createBinPage enterVehicleNumber(String data) {
		enterById("input-vehicleNumber", data);
		
		return this;
	}
	public createBinPage enterCrewMember(String data) {
		enterById("input-crewMember", data);
		return this;
	}
	public createBinPage enterBinLabel(String data) {
		enterById("input-binNumber", data);
		return this;
	}
	public createBinPage clickOnTicketNumberCheckBox() {
		clickByXpath("(//*[@class='StyledBox-sc-13pk1d4-0 PiYIl StyledCheckBox__StyledCheckBoxBox-sc-1dbk5ju-3 cJNjzg'])[1]");
		return this;
	}
	public ViewBinPage clickOnCreate() {
		clickByXpath("//*[@class='StyledButton-sc-323bzc-0 edaVNT']");
		return new ViewBinPage(driver, test);
	}

}
