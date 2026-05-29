package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPasswrod;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	
	public void enterLoginDetails(String email,String password) {
		txtEmailAddress.sendKeys(email);
		txtPasswrod.sendKeys(password);
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
}
