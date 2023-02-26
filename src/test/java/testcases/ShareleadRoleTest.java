package testcases;

import org.testng.annotations.Test;

import pages.MyBusses;
import utilities.DriverSetup;

public class ShareleadRoleTest extends DriverSetup {
	MyBusses selectSharelead = new MyBusses();
	@Test
	public void changeToSharelead() {
		getDriver().get("https://test.sharebus.co/my-trips");
		selectSharelead.clickOnMenu();
		selectSharelead.clickOnSharelead();
		selectSharelead.clickOnYes();
		selectSharelead.clickOnSetupAsharelead();
	}

}
