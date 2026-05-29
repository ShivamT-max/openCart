package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_Account_Registration() {
		
		//logger.info("*****Starting TC001*****");
		try {
			HomePage homepage = new HomePage(driver);
			homepage.clickMyAccount();
			//logger.info("Clicked on my account");
			homepage.clickRegister();
			AccountRegistration regpage = new AccountRegistration(driver);
			//logger.info("Providing customer details");
			regpage.setFirstName(randomString());
			regpage.setLastName(randomString());
			regpage.setEmail(randomString() + "@gmail.com");
			regpage.setTelephone(randomNumber());
			String pass = randomAlphaNumeric();
			regpage.setPassword(pass);
			regpage.confirmPassword(pass);
			regpage.clickCheckAgree();
			regpage.clickContinue();
			//logger.info("Validating Expected Message");
			String confirmMessage = regpage.getConfirmMessage();
			Assert.assertEquals(confirmMessage, "Your Account Has Been Created!");
		}catch (Exception e) {
//			logger.error("Test Failed");
//			logger.debug("debug logs");
			Assert.fail();
		}
		
	}

}
