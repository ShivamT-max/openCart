package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistration extends BasePage{

	public AccountRegistration(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement txtLastName;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@name='telephone']")
	WebElement txtTelephone;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@name='confirm']")
	WebElement txtConfirmPass;
	
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkAgree;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirm;
	
	public void setFirstName(String FirstName) {
		txtFirstName.sendKeys(FirstName);
	}
	
	public void setLastName(String LastName) {
		txtLastName.sendKeys(LastName);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	public void confirmPassword(String password) {
		txtConfirmPass.sendKeys(password);
	}

	public void clickCheckAgree() {
		chkAgree.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public String getConfirmMessage() {
		try {
			return msgConfirm.getText();
		}catch (Exception e) {
			return e.getMessage();
		}
	}
}
