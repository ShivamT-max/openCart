package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistration;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginTestDDT extends BaseClass{

	@Test(dataProvider = "LoginData",dataProviderClass = DataProviders.class)
	void verify_loginDDT(String email, String pssword) {
		HomePage home = new HomePage(driver);
		home.clickMyAccount();
		home.clickLogin();
		LoginPage login = new LoginPage(driver);
		login.enterLoginDetails(email, pssword);
		login.clickLoginButton();
		MyAccountPage myaccout = new MyAccountPage(driver);
		if(myaccout.isMyAccountPageExists()) {
			Assert.assertTrue(true);
			myaccout.clickLogout();
		}else {
			Assert.assertFalse(false);
		}
	}
	
	
}
