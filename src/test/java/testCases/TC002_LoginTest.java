package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	@Test
	public void verify_login() {
		try {
			HomePage homepage = new HomePage(driver);
			homepage.clickMyAccount();
			homepage.clickLogin();
			LoginPage lp = new LoginPage(driver);
			lp.enterLoginDetails(prop.getProperty("email"), prop.getProperty("passwrod"));
			lp.clickLoginButton();
			MyAccountPage myacc = new MyAccountPage(driver);
			boolean targetpage = myacc.isMyAccountPageExists();
			Assert.assertEquals(targetpage, true,"Login Failed");
		} catch (Exception e) {
			Assert.fail();
		}
	}
	
	
	
}
