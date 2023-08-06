package testClasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class LoginTest extends DriverSetup {
	DarazHomePage darazHomePage = new DarazHomePage();
	LoginPage loginPage = new LoginPage();

	@Test(priority = 1)
	public void loginPageTitle() {
		getDriver().get("https://www.daraz.com.bd");
		darazHomePage.clickOnSignUpLoginButton();
		assertEquals(getDriver().getTitle(), loginPage.LOGIN_PAGE_TITLE);
		System.out.println(getDriver().getTitle());

	}

	@Test(priority = 2)
	public void performLogin() throws InterruptedException {
		loginPage.doLogin("01611112222", "12345Mm");
		Thread.sleep(3000);
		String actualUserName = darazHomePage.getLoginAccountUserName();
		System.out.println(actualUserName);
		String expectedUserName = "MUMU'S ACCOUNT";
		assertEquals(expectedUserName, actualUserName);
	}

}
