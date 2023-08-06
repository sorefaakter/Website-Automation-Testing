package testClasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.DarazHomePage;
import pages.HelpCenterPage;
import utilities.DriverSetup;

public class HelpCenterTest extends DriverSetup {

	DarazHomePage darazHomePage = new DarazHomePage();
	HelpCenterPage helpCenterPage = new HelpCenterPage();

	@Test
	public void HelpCenterPageTitle() {
		getDriver().get("https://www.daraz.com.bd");
		darazHomePage.clickOnElement(darazHomePage.CUSTOMER_CARE_BUTTON);
		darazHomePage.clickOnElement(darazHomePage.HELP_CENTER_BUTTON);
		helpCenterPage.waitForElementVisiable(helpCenterPage.HELP_CENTER_TEXT);
		assertEquals(getDriver().getTitle(), helpCenterPage.HELP_CENTER_PAGE_TITLE);
	}
}
