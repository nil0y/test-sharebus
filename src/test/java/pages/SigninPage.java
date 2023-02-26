package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SigninPage extends BasePage {
	By EMAILFIELD = By.xpath("//*[@id=\"email\"]");
	By PASSWORDFIELD = By.xpath("//*[@id=\"password\"]");
	By SIGNIN = By.xpath("//*[@id=\"app\"]/div[1]/div/div/form/div[4]/button");
	
	public void inputEmail(String email) {
        WebElement emailField = getElement(EMAILFIELD);
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        WebElement passwordField = getElement(PASSWORDFIELD);
        passwordField.sendKeys(password);
    }

    public void clickSignIn() {
        WebElement signInButton = getElement(SIGNIN);
        signInButton.click();
    }
}
