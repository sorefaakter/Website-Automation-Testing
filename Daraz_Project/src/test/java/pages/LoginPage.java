package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	public String LOGIN_PAGE_TITLE = "Daraz.com.bd: Online Shopping Bangladesh - Mobiles, Tablets, Home Appliances, TV, Audio &amp; More";
	public By PHONE_NUMBER_EMAIL_INPUT_FIELD = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	public By PASSWORD_FIELD = By.xpath("//input[@placeholder='Please enter your password']");
	public By LOGIN_BUTTON = By.xpath("//button[normalize-space()='LOGIN']");

	public void doLogin(String phone, String password) {
		write(PHONE_NUMBER_EMAIL_INPUT_FIELD, phone);
		write(PASSWORD_FIELD, password);
		clickOnElement(LOGIN_BUTTON);

	}

}
