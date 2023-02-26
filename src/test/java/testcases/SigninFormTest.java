package testcases;

import org.testng.annotations.Test;

import pages.SigninPage;
import utilities.DriverSetup;

public class SigninFormTest extends DriverSetup {
	SigninPage signinForm = new SigninPage();
	@Test
	public void inputValues() {
		getDriver().get("https://test.sharebus.co/auth/signin");
		
		signinForm.inputEmail("brainstation23@yopmail.com");
		signinForm.inputPassword("Pass@1234");
		signinForm.clickSignIn();
		
		
	}
	

}
