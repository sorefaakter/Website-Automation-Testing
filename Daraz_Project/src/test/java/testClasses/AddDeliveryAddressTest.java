package testClasses;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AddDeliveryAddressPage;
import pages.DarazHomePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class AddDeliveryAddressTest extends DriverSetup {

	DarazHomePage darazHomePage = new DarazHomePage();
	LoginPage loginPage = new LoginPage();
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
	public void addDeliveryAddress() {
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.myAccount);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.manageMyAcc);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.clickEdit);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.addNewAddress);
		addDeliveryAddressPage.addAddress("Mumu");
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.country);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.selectCounty);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.city);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.selectCity);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.area);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.selectArea);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.selectdeliveryLable);
		addDeliveryAddressPage.clickOnElement(addDeliveryAddressPage.save);

	}
}
