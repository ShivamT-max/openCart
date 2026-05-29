package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement btnmyAccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement btnregister;
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement btnlogin;
	
	public void clickMyAccount() {
		btnmyAccount.click();
	}
	
	public void clickRegister() {
		btnregister.click();
	}
	
	public void clickLogin() {
		btnlogin.click();
	}
}
