package pages;

import org.openqa.selenium.By;

public class MyBusses extends BasePage {
	
	By MENU = By.xpath("//*[@id=\"navbarScrollingDropdown\"]/span[2]");
	By SHARELEAD = By.xpath("//*[@id=\"app\"]/nav/div/ul/li[2]/ul/li[3]/button");
	By YES = By.xpath("/html/body/div[2]/div[2]/div/div/div/div/button");
	By SETUPASHAREBUS = By.xpath("//*[@id=\"app\"]/div[1]/div[16]/button/div/span[1]");
	

	
	public void clickOnMenu() {
		clickOnElement(MENU);
	}
	public void clickOnSharelead() {
		clickOnElement(SHARELEAD);
	}
	public void clickOnYes() {
		clickOnElement(YES);
	}
	public void clickOnSetupAsharelead() {
		clickOnElement(SETUPASHAREBUS);
	}

}
