package pages;

import org.openqa.selenium.By;

public class DarazHomePage extends BasePage {

	public By SIGNUP_LOGIN_BUTTON = By.xpath("//a[normalize-space()='Signup / Login']");
	public By lOGGED_ACCOUNT_NAME = By.xpath("//span[@id='myAccountTrigger']");
	public By CUSTOMER_CARE_BUTTON = By.xpath("//span[normalize-space()='CUSTOMER CARE']");
	public By HELP_CENTER_BUTTON = By.xpath("//a[contains(text(),'Help Center')]");

	public void clickOnSignUpLoginButton() {
		clickOnElement(SIGNUP_LOGIN_BUTTON);
	}

	public String getLoginAccountUserName() {
		String text = getElementText(lOGGED_ACCOUNT_NAME);
		return text;
	}
}
