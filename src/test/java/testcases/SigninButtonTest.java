package testcases;

import org.testng.annotations.Test;

import pages.ShareBusHomepage;
import utilities.DriverSetup;

public class SigninButtonTest extends DriverSetup {
	
	ShareBusHomepage homepage = new ShareBusHomepage();
	@Test
	public void GotoLoginPage() throws InterruptedException {
		getDriver().get("https://test.sharebus.co/");
		homepage.clickOnSignupButton();
		
		Thread.sleep(2000);
	}

}
