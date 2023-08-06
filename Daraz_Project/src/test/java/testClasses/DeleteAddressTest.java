package testClasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.AddDeliveryAddressPage;
import pages.DarazHomePage;
import pages.DeleteAddressPage;
import pages.LoginPage;
import utilities.DriverSetup;

public class DeleteAddressTest extends DriverSetup {

	DarazHomePage darazHomePage = new DarazHomePage();
	LoginPage loginPage = new LoginPage();
	DeleteAddressPage deleteAddressPage = new DeleteAddressPage();
	AddDeliveryAddressPage addDeliveryAddressPage = new AddDeliveryAddressPage();

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

	@Test(priority = 3)
	public void deleteAddress() {
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.myAccount);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.manageMyAcc);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.clickEdit);
		deleteAddressPage.clickOnElement(deleteAddressPage.clickEditAddress);
		deleteAddressPage.clickOnElement(deleteAddressPage.deleteAddress);
		deleteAddressPage.clickOnElement(deleteAddressPage.confirmDeleteAdd);
		deleteAddressPage.clickOnElement(deleteAddressPage.save);
	}
}
