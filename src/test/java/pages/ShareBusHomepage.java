package pages;

import org.openqa.selenium.By;

public class ShareBusHomepage extends BasePage {
	
	By SIGNINBUTTON = By.xpath("//*[@id=\"app\"]/nav/div/ul/li/button");
	
	
	public void clickOnSignupButton() {
		clickOnElement(SIGNINBUTTON);
		
	}

}
